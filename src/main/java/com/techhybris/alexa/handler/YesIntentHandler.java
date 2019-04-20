package com.techhybris.alexa.handler;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import static com.amazon.ask.request.Predicates.intentName;

public class YesIntentHandler extends AbstractIntentHandler {

	private Logger LOG = LoggerFactory.getLogger(LaunchRequestHandler.class);
	private HelpIntentHandler helpHandler;
	@Override
	public Optional<Response> handle(HandlerInput input) {
		LOG.error("YesIntent Handler is called.");
		String speechText = "";
		Map<String, Object> sessionAttributes = input.getAttributesManager().getSessionAttributes();
		Object typeObject = sessionAttributes.get("type");
		LOG.error("YesIntent Handler typeObject "+typeObject);
		if(null != typeObject && typeObject instanceof String) {
			String type = (String) typeObject;
			switch (type) {
			case "help":{
				LOG.error("Returning Help Intent Handler");
				return helpHandler.handle(input);
			}
				
			case "cartDetails":
				return new LaunchRequestHandler().handle(input);
			default:
				speechText = "Sorry, I do not understand how to process that.";
			}
		}
		else {
			speechText = "Sorry, I am not sure what you are saying Yes for.";
		}
		return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("Yes/No", speechText).build();
	}

	@Override
	protected void handleInternal(HandlerInput input) {
	}

	@Required
	public void setHelpHandler(HelpIntentHandler helpHandler) {
		this.helpHandler = helpHandler;
	}
	
	
	

}