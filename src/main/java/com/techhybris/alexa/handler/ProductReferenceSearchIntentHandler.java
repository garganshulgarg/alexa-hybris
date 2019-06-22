package com.techhybris.alexa.handler;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.google.common.collect.Lists;
import com.techhybris.alexa.integration.HybrisProductReferenceService;
import com.techhybris.alexa.integration.HybrisProductSearchService;
import com.techhybris.alexa.product.data.Product;
import com.techhybris.alexa.product.data.ProductSearchResult;
import com.techhybris.alexa.product.references.data.ProductReferenceSearchResult;
import com.techhybris.alexa.product.references.data.Reference;

public class ProductReferenceSearchIntentHandler extends AbstractIntentHandler {

	private Logger LOG = LoggerFactory.getLogger(ProductReferenceSearchIntentHandler.class);
	

	@Resource(name = "hybrisProductReferenceService")
	private HybrisProductReferenceService hybrisProductReferenceService;
	
	@Override
	protected void handleInternal(HandlerInput input) {
		String accessToken = getAccessToken(input, true);
		LOG.error("Access Token: {}", accessToken);
		
		Map<String, Object> sessionAttributes = input.getAttributesManager().getSessionAttributes();
		String product_code = StringUtils.EMPTY;
		Object typeObject = sessionAttributes.get("PRODUCT_CODE");
		LOG.error("Getting product code {} from session.",typeObject);
		if(null != typeObject && typeObject instanceof String) {
			product_code = (String) typeObject;
		}

		
		
		ProductReferenceSearchResult productSearchResult = hybrisProductReferenceService.findProductReferences(accessToken, product_code);
		
		if(null != productSearchResult) {
			List<String> productCodeList = Lists.newArrayList();
			Map<String, String> productDetails = new HashMap<>();
			for (Reference reference : productSearchResult.getReferences()) {
				productDetails.put(reference.getTarget().getCode(), reference.getTarget().getName());
				productCodeList.add(reference.getTarget().getCode());
			}
			setSessionAttributes(input, "products", productDetails);
			setSessionAttributes(input, "productList", productCodeList);
		}
		
		addModel(input, "productSearchResult", productSearchResult);
	}

}