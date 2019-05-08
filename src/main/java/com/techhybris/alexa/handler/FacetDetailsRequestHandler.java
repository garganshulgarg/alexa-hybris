package com.techhybris.alexa.handler;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.techhybris.alexa.integration.HybrisProductSearchService;
import com.techhybris.alexa.product.data.FacetsSummay;
import com.techhybris.alexa.product.data.ProductSearchResult;
import com.techhybris.alexa.service.HybrisProductFacetsService;

public class FacetDetailsRequestHandler extends AbstractIntentHandler {

	private Logger LOG = LoggerFactory.getLogger(FacetDetailsRequestHandler.class);
		
	@Resource(name = "hybrisProductFacetsService")
	private HybrisProductFacetsService hybrisProductFacetsService;
	
	@Override
	protected void handleInternal(HandlerInput input) {
		String accessToken = getAccessToken(input, true);
		LOG.error("Access Token: {}", accessToken);
		FacetsSummay summary = hybrisProductFacetsService.getFacetsIntoSession(input);
		if(null != summary) {
			addModel(input, "facetsResult", summary.getFacetsResult());
		}
	}
}