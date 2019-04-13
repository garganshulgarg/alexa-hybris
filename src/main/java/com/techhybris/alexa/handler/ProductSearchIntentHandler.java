package com.techhybris.alexa.handler;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
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
		
		ProductSearchResult result = hybrisProductSearchService.findProducts(accessToken, getSlots(input));
		List<String> productList = new ArrayList<>();
		for(Product product: result.getProducts()) {
			productList.add(product.getName());
		}
		addModel(input, "products", productList);
	}

}