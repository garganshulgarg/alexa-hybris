package com.techhybris.alexa.handler;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.techhybris.alexa.cartmodification.data.CartModificationData;
import com.techhybris.alexa.integration.HybrisAddToCartConnectorService;

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
		Object productListObject = sessionAttributes.get("productList");
		String selectedProductCode = null;
		List<String> productList = null;
		Map<String, String> productMap = null;
		
		if(null != productsObject && null != productListObject) {
			productMap = (Map<String, String>) productsObject;
			productList = (List<String>) productListObject;
			
			Map<String, String> slots = getSlots(input);
			int position = -1;
			if(null != slots && null != slots.get("position")) {
				position = getNumberFromString(slots.get("position"));
				LOG.error("position selected by customer {}", position);
				
			}
			
			selectedProductCode = productList.get(position-1);
			LOG.error("Product selected by customer {}", selectedProductCode);
		}
		
		CartModificationData cmd=hybrisAddToCartConnectorService.addToCart(selectedProductCode,accessToken);
		setSessionAttributes(input, "type", "cartDetails");
		
		if(null != selectedProductCode) {
			addModel(input, "productName", productMap.get(selectedProductCode));
		}
	}
	
	
	
	int getNumberFromString(String position) {
		if(StringUtils.isEmpty(position))
		{
			return -1;
		}
		
		if(position.contains("first") || position.contains("1") || position.contains("1st")) {
			return 1;
		}
		if(position.contains("second") || position.contains("2") || position.contains("2nd")) {
			return 2;
		}
		if(position.contains("third") || position.contains("3") || position.contains("3rd")) {
			return 3;
		}
		if(position.contains("fourth") || position.contains("4") || position.contains("4th")) {
			return 4;
		}
		
		return -1;
		
	}

	
}