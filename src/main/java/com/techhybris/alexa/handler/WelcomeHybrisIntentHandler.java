package com.techhybris.alexa.handler;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.Response;
import com.techhybris.alexa.ingration.HybrisConnectorService;

import java.util.Optional;
import org.slf4j.Logger;

import javax.annotation.Resource;

import org.slf4j.LoggerFactory;

public class WelcomeHybrisIntentHandler extends AbstractIntentHandler {

	private Logger LOG = LoggerFactory.getLogger(WelcomeHybrisIntentHandler.class);

	@Resource(name = "hybrisConnectorService")
	private HybrisConnectorService hybrisConnectorService;

	@Override
	public Optional<Response> handle(HandlerInput input) {
		String speechText = "Welcome Hybris " + hybrisConnectorService.test();
		// Logging sample example.
		LOG.error(speechText);
		System.out.println("SYSO: " + speechText);
		return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("WelcomeHybris", speechText).build();
	}

}