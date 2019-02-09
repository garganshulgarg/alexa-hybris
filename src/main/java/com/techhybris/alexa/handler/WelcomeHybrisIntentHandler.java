package com.techhybris.alexa.handler;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class WelcomeHybrisIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("WelcomeHybrisIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Welcome Hybris";
       return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("WelcomeHybris", speechText)
                .build();
    }

}