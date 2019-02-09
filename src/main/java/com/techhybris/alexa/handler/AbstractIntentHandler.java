package com.techhybris.alexa.handler;

import static com.amazon.ask.request.Predicates.intentName;

import org.springframework.beans.factory.annotation.Required;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;

public abstract class AbstractIntentHandler  implements RequestHandler {
	
	private String intentName;
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName(intentName));
    }
    
    @Required
	public void setIntentName(String intentName) {
		this.intentName = intentName;
	}
    

}
