package com.techhybris.alexa.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazonaws.util.CollectionUtils;
import com.techhybris.alexa.handler.ProductSearchIntentHandler;
import com.techhybris.alexa.product.data.Facet;
import com.techhybris.alexa.product.data.FacetsSummay;
import com.techhybris.alexa.product.data.ProductSearchResult;
import com.techhybris.alexa.product.data.Sort;
import com.techhybris.alexa.product.data.Value;
import com.techhybris.alexa.service.HybrisProductFacetsService;

public class HybrisProductFacetsServiceImpl implements HybrisProductFacetsService{

	private Logger LOG = LoggerFactory.getLogger(HybrisProductFacetsServiceImpl.class);
	
	private static final String QUERY = "query";
	private static final String color = "color";

	@Override
	public void setFacetsIntoSession(ProductSearchResult result, HandlerInput input) {
		FacetsSummay summary = buildFacetsSummary(result, input);
		input.getAttributesManager().getSessionAttributes().put(FACETS_SESSION_KEY,summary);
	}

	@Override
	public FacetsSummay getFacetsIntoSession(HandlerInput input) {
		Object summary = input.getAttributesManager().getSessionAttributes().get(FACETS_SESSION_KEY);
		if(null != summary) {
			return (FacetsSummay) summary;
		}
		return new FacetsSummay(); 
	}

	@Override
	public Map<String, String> buildFacetsQuery(HandlerInput input, Map<String, String> params) {
		FacetsSummay summary = getFacetsIntoSession(input);
		String query = params.get(QUERY);
		Map<String, Object> facetValSelected = parseQuery(summary, query);
		StringBuilder queryBuilder = new StringBuilder();

		if(null != facetValSelected.get("query")) {
			queryBuilder.append(facetValSelected.get("query"));
		}

		if(null != facetValSelected.get("sort")) {
			queryBuilder.append(':');
			queryBuilder.append(facetValSelected.get("sort"));
		}
		
		if(null != facetValSelected.get("facet")) {
			for(String val : (Set<String>) facetValSelected.get("facet")) {
				queryBuilder.append(':');
				if(StringUtils.isNotBlank(summary.getFacetsResult().get(val))) {
					queryBuilder.append(val + ":" + summary.getFacetsResult().get(val)); 
				}
			}
		}
		params.put(QUERY,queryBuilder.toString());
		return params;
	}
	private Map<String, Object> parseQuery(FacetsSummay summary, String queryText) {
		StringBuilder queryBuilder = new StringBuilder(queryText);
		Map<String, Object> facetValSelected = new HashMap<String, Object>();
		Set<String> facetsVal = new HashSet<String>();
		if(null != summary.getFacetsResult() && CollectionUtils.isNullOrEmpty(summary.getFacetsResult().keySet())) {
			for(String val : summary.getFacetsResult().keySet()) {
				int idx = queryBuilder.indexOf(val);
				int lstIdx = queryBuilder.lastIndexOf(val);
				if( idx != -1) {
					facetsVal.add(val);
					queryBuilder.delete(idx, lstIdx);
				}
			}
			facetValSelected.put("facet",facetsVal);
		}
		String query = StringUtils.remove(queryBuilder.toString(), "And");
		query = StringUtils.remove(query, "null");
		query = StringUtils.trimToEmpty(query);
		LOG.error(query);
		facetValSelected.put("query", query);
		if(StringUtils.isNotBlank(summary.getSort())) {
			facetValSelected.put("sort",summary.getSort());
		}
		return facetValSelected;
	}
	private FacetsSummay buildFacetsSummary(ProductSearchResult result, HandlerInput input) {
		FacetsSummay summary = getFacetsIntoSession(input);
		populateFacetResult(summary, result);
		return summary;
	}
	private void populateFacetResult(FacetsSummay summary, ProductSearchResult result) {
		
		List<Facet> facetsList =  result.getFacets();
		if(CollectionUtils.isNullOrEmpty(facetsList)) {
			Map<String, String> facetsResult = new HashMap<>();
			Map<String, Boolean> facetsMode = new HashMap<>();
			Map<String, String> selectedFacets = new HashMap<>();

			for(Facet facet : facetsList) {
				facetsMode.put(facet.getName(), facet.getMultiSelect());
				for(Value value : facet.getValues()) {
					facetsResult.put(value.getName(),facet.getName());
					if(value.getSelected()) {
						selectedFacets.put(value.getName(),facet.getName());
					}
				}
			}
		}
		String query = result.getCurrentQuery().getQuery().getValue();
		if(StringUtils.isNotBlank(query)) {
			String queryList [] = StringUtils.split(query,':');
			summary.setQuery(queryList[0]);
		}
		if(CollectionUtils.isNullOrEmpty(result.getSorts())) {
			List<String> supportedSorts = new ArrayList<>();
			for(Sort sortVal :  result.getSorts()) {
				supportedSorts.add(sortVal.getCode());
				if(sortVal.getSelected()) {
					summary.setSort(sortVal.getCode());
				}
			}
		}
	}
}
