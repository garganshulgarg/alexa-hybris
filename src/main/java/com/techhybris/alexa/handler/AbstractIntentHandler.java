package com.techhybris.alexa.handler;

import static com.amazon.ask.request.Predicates.intentName;

import java.io.StringWriter;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.apache.commons.collections.MapUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.apache.velocity.runtime.resource.loader.FileResourceLoader;
import org.springframework.beans.factory.annotation.Required;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public abstract class AbstractIntentHandler implements RequestHandler {

	private String intentName;
	private String speachName;
	private String cardName;

	private static final String speachPath = "/view/speech";
	private static final String cardPath = "/view/card";
	private static VelocityEngine velocityEngineSpeech;
	private static VelocityEngine velocityEngineCard;

    @Override
    public Optional<Response> handle(HandlerInput input) {
    	handleInternal(input);
    	String speechText=getSpeechText(input);
    	String cardText = getCardText(input);//="WelcomeHybris";
    	
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard(cardText, speechText)
                .build();

    }
	@Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName(intentName));
	}

	protected abstract void handleInternal(HandlerInput input);
	
	protected String getAccessToken(HandlerInput input, boolean isAccessTokenRequired) {
		if(isAccessTokenRequired) {
			return input
		            .getRequestEnvelope()
		            .getContext()
		            .getSystem()
		            .getUser()
		            .getAccessToken();
		}
		return null;
	}
	
	protected void addModel(HandlerInput input, String key, Object value) {
		input.getAttributesManager().getRequestAttributes().put(key, value);
	}
	private void addContext(HandlerInput input, VelocityContext context) {
		Map<String, Object> reqAttributes = input.getAttributesManager().getRequestAttributes();
		if(MapUtils.isNotEmpty(reqAttributes)) {
			Set<String> keys = reqAttributes.keySet();	
			for(String key : keys) {
				context.put(key, reqAttributes.get(key));
				System.out.println(key + " : "+reqAttributes.get(key));
			}
		}else {
			System.out.println("reqAttributes are empty");
		}
		
		
	}
	private String getSpeechText(HandlerInput input) {
        VelocityEngine ve = getSpeechVelocityEngine();
        /*  next, get the Template  */
        Template t = ve.getTemplate( speachName + ".vm" );
        /*  create a context and add data */
        VelocityContext context = new VelocityContext();
        addContext(input,context);
        /* now render the template into a StringWriter */
        StringWriter writer = new StringWriter();
        t.merge( context, writer );
        /* show the World */
        return writer.toString(); 		
	}
	private String getCardText(HandlerInput input) {
        VelocityEngine ve = getCardVelocityEngine();
        /*  next, get the Template  */
        Template t = ve.getTemplate( cardName  + ".vm");
        /*  create a context and add data */
        VelocityContext context = new VelocityContext();
        addContext(input,context);
        /* now render the template into a StringWriter */
        StringWriter writer = new StringWriter();
        t.merge( context, writer );
        /* show the World */
        return writer.toString(); 		

	}


	private VelocityEngine getSpeechVelocityEngine() {
		if (velocityEngineSpeech == null) {
			velocityEngineSpeech = createVelocityEngine(getResourcePath() + speachPath);
		}
		return velocityEngineSpeech;
	}

	private VelocityEngine getCardVelocityEngine() {
		if (velocityEngineCard == null) {
			velocityEngineCard = createVelocityEngine(getResourcePath() + cardPath);
		}
		return velocityEngineCard;
	}

	private VelocityEngine createVelocityEngine(final String resourceDir) {
		final VelocityEngine ve = new VelocityEngine();
		if (resourceDir == null) {
			ve.addProperty("resource.loader", "class");
		} else {
			ve.addProperty("resource.loader", "file, class");
			ve.addProperty("file.resource.loader.class", FileResourceLoader.class.getName());
			ve.addProperty("file.resource.loader.path", resourceDir);
		}
		ve.addProperty("class.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();
		return ve;
	}

	@Required
	public void setIntentName(String intentName) {
		this.intentName = intentName;
	}

	public void setSpeachName(String speachName) {
		this.speachName = speachName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	protected final String getResourcePath() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResource("resources").getPath();
	}

}
