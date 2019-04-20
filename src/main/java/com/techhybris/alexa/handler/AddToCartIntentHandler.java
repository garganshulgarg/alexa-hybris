package com.techhybris.alexa.handler;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.Slot;
import com.techhybris.alexa.integration.HybrisProductSearchService;
import com.techhybris.alexa.product.data.ProductSearchResult;

public class AddToCartIntentHandler extends AbstractIntentHandler {

	private Logger LOG = LoggerFactory.getLogger(AddToCartIntentHandler.class);
	
	
	@Override
	protected void handleInternal(HandlerInput input) {
		String accessToken = getAccessToken(input, true);
		LOG.error("Access Token: {}", accessToken);
		Map<String, Object> sessionAttributes = input.getAttributesManager().getSessionAttributes();
		Object productsObject = sessionAttributes.get("productSearchResult");
		LOG.error("Products Object ", productsObject);
		//LOG.error("Slot Values ", getNumberSlots(input));
		setSessionAttributes(input, "type", "cartDetails");
	}
	
	
	/*protected Map<String, String> getNumberSlots(HandlerInput input) {
		IntentRequest request = getIntentRequest(input);
		Map<String, String> slotValues = new HashMap<>();
		Map<String, Slot> slots =  request.getIntent().getSlots();
		LOG.error("Slot Values ", slots);
		if(null == slots) {
			return null;
		}
		for(String key : slots.keySet()) {
			slotValues.put(key, slots.get(key).getValue());
		}
		return slotValues;
	}
*/
}