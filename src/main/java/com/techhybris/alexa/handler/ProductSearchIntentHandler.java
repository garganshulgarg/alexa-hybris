package com.techhybris.alexa.handler;


import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.google.common.collect.Lists;
import com.techhybris.alexa.integration.HybrisProductSearchService;
import com.techhybris.alexa.product.data.Product;
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
		if(null != productSearchResult) {
			List<String> productCodes = Lists.newArrayList();
			for (Product product : productSearchResult.getProducts()) {
				productCodes.add(product.getCode());
			}
			LOG.error("productCodes: {}", productCodes);
			setSessionAttributes(input, "products", productCodes);
		}
		
		addModel(input, "productSearchResult", productSearchResult);
	}

}