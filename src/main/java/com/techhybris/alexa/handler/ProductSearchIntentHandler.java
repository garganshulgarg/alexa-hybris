package com.techhybris.alexa.handler;


import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.techhybris.alexa.integration.HybrisProductSearchService;
import com.techhybris.alexa.product.data.ProductSearchResult;

public class ProductSearchIntentHandler extends AbstractIntentHandler {

	private Logger LOG = LoggerFactory.getLogger(ProductSearchIntentHandler.class);
	

	@Resource(name = "hybrisProductSearchService")
	private HybrisProductSearchService hybrisProductSearchService;
	
	@Override
	protected void handleInternal(HandlerInput input) {
		String accessToken = getAccessToken(input, true);
		LOG.error("Access Token: {}", accessToken);
		
		ProductSearchResult productSearchResult = hybrisProductSearchService.findProducts(accessToken, getSlots(input));
		if(null != productSearchResult && CollectionUtils.isNotEmpty(productSearchResult.getProducts())) {
			LOG.error("Setting session attributes of products: "+productSearchResult);
			//setSessionAttributes(input, "productSearchResult", productSearchResult);
		}
		
		addModel(input, "productSearchResult", productSearchResult);
	}

}