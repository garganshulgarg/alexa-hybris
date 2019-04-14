package com.techhybris.alexa.integration;

import java.util.Map;

import com.techhybris.alexa.product.data.ProductSearchResult;


public interface HybrisProductSearchService {
	public ProductSearchResult findProducts(String accessToken, Map<String, String> params);
}
