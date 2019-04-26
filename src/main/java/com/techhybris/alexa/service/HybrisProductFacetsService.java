package com.techhybris.alexa.service;

import java.util.Map;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.techhybris.alexa.product.data.FacetsSummay;
import com.techhybris.alexa.product.data.ProductSearchResult;

public interface HybrisProductFacetsService {
	
	final String FACETS_SESSION_KEY = "FACETS_SESSION_KEY"; 
	
	void setFacetsIntoSession(final ProductSearchResult result, HandlerInput input);
	
	FacetsSummay getFacetsIntoSession(HandlerInput input);
	
	Map<String, String> buildFacetsQuery(HandlerInput input, Map<String, String> params);

}
