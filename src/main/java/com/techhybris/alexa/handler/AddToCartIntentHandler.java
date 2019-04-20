package com.techhybris.alexa.handler;

import java.util.List;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;

public class AddToCartIntentHandler extends AbstractIntentHandler {

	private Logger LOG = LoggerFactory.getLogger(AddToCartIntentHandler.class);

	@Override
	protected void handleInternal(HandlerInput input) {
		String accessToken = getAccessToken(input, true);
		LOG.error("Access Token: {}", accessToken);
		Map<String, Object> sessionAttributes = input.getAttributesManager().getSessionAttributes();
		Object productsObject = sessionAttributes.get("products");
		String selectedProductCode = null;
		if(null != productsObject) {
			List<String> productList = (List<String>) productsObject;
			// This is hardcoded we need to use getSlots
			int position = 2;
			selectedProductCode = productList.get(position-1);
		}
		
		
		setSessionAttributes(input, "type", "cartDetails");
	}

	
}