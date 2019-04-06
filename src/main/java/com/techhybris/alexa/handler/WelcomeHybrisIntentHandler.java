package com.techhybris.alexa.handler;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.techhybris.alexa.integration.HybrisConnectorService;
import com.techhybris.alexa.response.data.UserData;

public class WelcomeHybrisIntentHandler extends AbstractIntentHandler {

	private Logger LOG = LoggerFactory.getLogger(WelcomeHybrisIntentHandler.class);
	

	@Resource(name = "hybrisConnectorService")
	private HybrisConnectorService hybrisConnectorService;
	
	

	@Override
	protected void handleInternal(HandlerInput input) {
		String accessToken = getAccessToken(input, true);
		LOG.error("Access Token: {}", accessToken);
		UserData user =  hybrisConnectorService.getUserProfile(accessToken);
		addModel(input, "user", user);
	}

}