package com.techhybris.alexa.product.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FacetsSummay {
	private String query;
	private String sort = "relevance";
	private Map<String, String> selectedFacets;
	private Map<String, String> facetsResult;
	private Map<String, Boolean> facetsMode;
	private List<String> supportedSorts;
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public Map<String, String> getSelectedFacets() {
		return selectedFacets;
	}
	public void setSelectedFacets(Map<String, String> selectedFacets) {
		this.selectedFacets = selectedFacets;
	}
	public Map<String, String> getFacetsResult() {
		return facetsResult;
	}
	public void setFacetsResult(Map<String, String> facetsResult) {
		this.facetsResult = facetsResult;
	}
	public Map<String, Boolean> getFacetsMode() {
		return facetsMode;
	}
	public void setFacetsMode(Map<String, Boolean> facetsMode) {
		this.facetsMode = facetsMode;
	}
	public List<String> getSupportedSorts() {
		return supportedSorts;
	}
	public void setSupportedSorts(List<String> supportedSorts) {
		this.supportedSorts = supportedSorts;
	}

	
}
