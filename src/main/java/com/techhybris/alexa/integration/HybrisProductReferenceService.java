package com.techhybris.alexa.integration;

import java.util.Map;

import com.techhybris.alexa.product.data.ProductSearchResult;
import com.techhybris.alexa.product.references.data.ProductReferenceSearchResult;


public interface HybrisProductReferenceService {
	public ProductReferenceSearchResult findProductReferences(String accessToken, Map<String, String> params);
}
