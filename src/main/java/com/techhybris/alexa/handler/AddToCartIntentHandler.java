package com.techhybris.alexa.handler;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.techhybris.alexa.cartmodification.data.CartModificationData;
import com.techhybris.alexa.integration.HybrisAddToCartConnectorService;
import com.techhybris.alexa.integration.HybrisConnectorService;

public class AddToCartIntentHandler extends AbstractIntentHandler {

	private Logger LOG = LoggerFactory.getLogger(AddToCartIntentHandler.class);
	
	@Resource(name = "hybrisAddToCartConnectorService")
	private HybrisAddToCartConnectorService hybrisAddToCartConnectorService;
	
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
		
		//Product is hardcoded currently
		CartModificationData cmd=hybrisAddToCartConnectorService.addToCart("1432722",accessToken);
		LOG.error("Status code: "+cmd.getStatusCode());
		LOG.error("Status message: "+cmd.getStatusMessage());
		LOG.error("Entry number: "+cmd.getEntry().getEntryNumber());
		LOG.error("Entry quantity: "+cmd.getEntry().getQuantity());
		LOG.error("Quantity Added: "+cmd.getQuantityAdded());

		setSessionAttributes(input, "type", "cartDetails");
	}

	
}