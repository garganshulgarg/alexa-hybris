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
	private CartDetailsRequestHandler cartDetailsRequestHandler;
	private ProductReferenceSearchIntentHandler productReferenceSearchHandler;
	@Override
	public Optional<Response> handle(HandlerInput input) {
		String speechText = "";
		Map<String, Object> sessionAttributes = input.getAttributesManager().getSessionAttributes();
		Object typeObject = sessionAttributes.get("type");
		if(null != typeObject && typeObject instanceof String) {
			String type = (String) typeObject;
			switch (type) {
			case "help":
				return helpHandler.handle(input);
			case "cartDetails":
				return cartDetailsRequestHandler.handle(input);
			case "Product_Referance":
				return productReferenceSearchHandler.handle(input);	
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

	@Required
	public void setCartDetailsRequestHandler(CartDetailsRequestHandler cartDetailsRequestHandler) {
		this.cartDetailsRequestHandler = cartDetailsRequestHandler;
	}
	@Required
	public void setProductReferenceSearchHandler(ProductReferenceSearchIntentHandler productReferenceSearchHandler) {
		this.productReferenceSearchHandler = productReferenceSearchHandler;
	}
	
	
	
	
	
	
	

}