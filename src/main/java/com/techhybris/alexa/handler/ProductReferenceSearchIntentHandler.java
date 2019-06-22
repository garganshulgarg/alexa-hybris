package com.techhybris.alexa.handler;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazonaws.util.StringUtils;
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
		String product_code = "";
		Object typeObject = sessionAttributes.get("PRODUCT_CODE");
		if(null != typeObject && typeObject instanceof String) {
			product_code = (String) typeObject;
		}

		Map<String, String> slotValues = new HashMap<>();
		if(StringUtils.isNullOrEmpty(product_code)) {
		slotValues.put("ProductCode", product_code);
		} else {
			slotValues.put("ProductCode", "");
		}
		
		
		ProductReferenceSearchResult productSearchResult = hybrisProductReferenceService.findProductReferences(accessToken, getSlots(input));
		
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