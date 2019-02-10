package com.techhybris.alexa.handler;

import java.util.Optional;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.Response;
import com.techhybris.alexa.integration.HybrisConnectorService;

public class WelcomeHybrisIntentHandler extends AbstractIntentHandler {

	private Logger LOG = LoggerFactory.getLogger(WelcomeHybrisIntentHandler.class);
	

	@Resource(name = "hybrisConnectorService")
	private HybrisConnectorService hybrisConnectorService;
	
	@Value("${alexa.intent.name}")
	private String alexaIntentName;
	

	@Override
	public Optional<Response> handle(HandlerInput input) {
		String speechText = "Welcome Hybris " + hybrisConnectorService.test();
		// Logging sample example.
		// Properties sample example. This is only for reference.
		LOG.error(speechText +" Property: "+ alexaIntentName);
		return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("WelcomeHybris", speechText).build();
	}

}