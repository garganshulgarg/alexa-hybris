package com.techhybris.alexa.handler;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.techhybris.alexa.integration.HybrisProductSearchService;
import com.techhybris.alexa.product.data.ProductSearchResult;
import com.techhybris.alexa.service.HybrisProductFacetsService;

public class ProductSearchIntentHandler extends AbstractIntentHandler {

	private Logger LOG = LoggerFactory.getLogger(ProductSearchIntentHandler.class);
	

	@Resource(name = "hybrisProductSearchService")
	private HybrisProductSearchService hybrisProductSearchService;
	
	@Resource(name = "hybrisProductFacetsService")
	private HybrisProductFacetsService hybrisProductFacetsService;
	
	@Override
	protected void handleInternal(HandlerInput input) {
		String accessToken = getAccessToken(input, true);
		LOG.error("Access Token: {}", accessToken);
		
		ProductSearchResult productSearchResult = hybrisProductSearchService.findProducts(
						accessToken, hybrisProductFacetsService.buildFacetsQuery(input, getSlots(input)));
		addModel(input, "productSearchResult", productSearchResult);
		hybrisProductFacetsService.setFacetsIntoSession(productSearchResult, input);
	}

}