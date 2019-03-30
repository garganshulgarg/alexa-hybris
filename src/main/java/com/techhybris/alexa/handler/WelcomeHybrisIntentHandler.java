package com.techhybris.alexa.handler;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.techhybris.alexa.integration.HybrisConnectorService;

public class WelcomeHybrisIntentHandler extends AbstractIntentHandler {

	private Logger LOG = LoggerFactory.getLogger(WelcomeHybrisIntentHandler.class);
	

	@Resource(name = "hybrisConnectorService")
	private HybrisConnectorService hybrisConnectorService;
	
	

	@Override
	protected void handleInternal(HandlerInput input) {
		String accessToken = getAccessToken(input, true);
		LOG.debug("Access Token: {}", accessToken);
		String testText =  hybrisConnectorService.getCurrentCustomerCart(accessToken);
		addModel(input, "name", "Hybris");
		addModel(input, "testService", "TEST");
	}

}