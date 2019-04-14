package com.techhybris.alexa.handler;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.LaunchRequest;
import com.techhybris.alexa.integration.HybrisConnectorService;
import com.techhybris.alexa.user.data.UserData;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.amazon.ask.request.Predicates.requestType;


public class LaunchRequestHandler extends AbstractIntentHandler {

	private Logger LOG = LoggerFactory.getLogger(LaunchRequestHandler.class);

	@Resource(name = "hybrisConnectorService")
	private HybrisConnectorService hybrisConnectorService;

	@Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(requestType(LaunchRequest.class));
	}


	@Override
	protected void handleInternal(HandlerInput input) {
		String accessToken = getAccessToken(input, true);
		LOG.error("Access Token: {}", accessToken);
		UserData user = hybrisConnectorService.getUserProfile(accessToken);
		addModel(input, "user", user);

	}

}