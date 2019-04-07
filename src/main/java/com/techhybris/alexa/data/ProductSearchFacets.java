package com.techhybris.alexa.data;

import java.util.ArrayList;
import java.util.List;

public class ProductSearchFacets {
	
	private String name;
	private List<ProductSearchFacetValue> values = new ArrayList<ProductSearchFacetValue>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ProductSearchFacetValue> getValues() {
		return values;
	}
	public void setValues(List<ProductSearchFacetValue> values) {
		this.values = values;
	}
	
	
}
