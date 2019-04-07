package com.techhybris.alexa.data;

import java.util.ArrayList;
import java.util.List;

public class ProductSearchResult {

	private List<ProductSearchFacets> facets = new ArrayList<ProductSearchFacets>();

	public List<ProductSearchFacets> getFacets() {
		return facets;
	}

	public void setFacets(List<ProductSearchFacets> facets) {
		this.facets = facets;
	}
	
	
}
