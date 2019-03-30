package com.techhybris.alexa.handler;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.techhybris.alexa.integration.HybrisConnectorService;

public class WelcomeHybrisIntentHandler extends AbstractIntentHandler {

	private Logger LOG = LoggerFactory.getLogger(WelcomeHybrisIntentHandler.class);
	

	@Resource(name = "hybrisConnectorService")
	private HybrisConnectorService hybrisConnectorService;
	
	@Value("${alexa.intent.name}")
	private String alexaIntentName;
	

	@Override
	protected void handleInternal(HandlerInput input) {

		String testText =  hybrisConnectorService.testRestServices();
		// Logging sample example.
		// Properties sample example. This is only for reference.
		LOG.error(testText +" Property: "+ alexaIntentName);
		addModel(input, "name", "Hybris");
		addModel(input, "testService", testText);
	}

}