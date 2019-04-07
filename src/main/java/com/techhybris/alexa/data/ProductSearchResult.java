package com.techhybris.alexa.data;

import java.util.List;

public class ProductSearchResult {

	private List<ProductSearchFacets> facets;

	public List<ProductSearchFacets> getFacets() {
		return facets;
	}

	public void setFacets(List<ProductSearchFacets> facets) {
		this.facets = facets;
	}
	
	
}
