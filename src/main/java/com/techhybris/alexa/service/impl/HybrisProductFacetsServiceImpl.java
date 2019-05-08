package com.techhybris.alexa.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
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
		LOG.error("Starting setFacetsIntoSession");
		FacetsSummay summary = buildFacetsSummary(result, input);
		input.getAttributesManager().getSessionAttributes().put(FACETS_SESSION_KEY, summary);
		LOG.error("Ending setFacetsIntoSession");
	}

	@Override
	public FacetsSummay getFacetsIntoSession(HandlerInput input) {
		FacetsSummay summary = new FacetsSummay();

		if (input.getAttributesManager().getSessionAttributes().containsKey(FACETS_SESSION_KEY)) {
			
			LinkedHashMap summaryMap = (LinkedHashMap) input
													   .getAttributesManager()
													   .getSessionAttributes()
													   .get(FACETS_SESSION_KEY);
			if (null != summaryMap) {
				if (summaryMap.containsKey("query")) {
					summary.setQuery((String) summaryMap.get("query"));
				}
				if (summaryMap.containsKey("sort")) {
					summary.setSort((String) summaryMap.get("sort"));
				}
				if (summaryMap.containsKey("facetsResult")) {
					summary.setFacetsResult((Map) summaryMap.get("facetsResult"));
				}
				if (summaryMap.containsKey("selectedFacets")) {
					summary.setSelectedFacets((Map) summaryMap.get("selectedFacets"));
				}
				if (summaryMap.containsKey("facetsMode")) {
					summary.setFacetsMode((Map) summaryMap.get("facetsMode"));
				}
				if (summaryMap.containsKey("supportedSorts")) {
					summary.setSupportedSorts((List) summaryMap.get("supportedSorts"));
				}
			}
		}
		return summary;
	}

	@Override
	public Map<String, String> buildFacetsQuery(HandlerInput input, Map<String, String> params) {
		LOG.error("Starting buildFacetsQuery");
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
		if(null == facetValSelected.get("facet")) {
			facetValSelected.put("facet", new HashSet<String>());
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
		LOG.error("Ending buildFacetsQuery");
		return params;
	}
	private Map<String, Object> parseQuery(FacetsSummay summary, String queryText) {
		LOG.error("Starting parseQuery");
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
		LOG.error("Ending parseQuery");
		return facetValSelected;
	}
	private FacetsSummay buildFacetsSummary(ProductSearchResult result, HandlerInput input) {
		LOG.error("Starting buildFacetsSummary");
		FacetsSummay summary = getFacetsIntoSession(input);
		populateFacetResult(summary, result);
		LOG.error("Ending buildFacetsSummary");
		return summary;
	}
	private void populateFacetResult(FacetsSummay summary, ProductSearchResult result) {
		LOG.error("Starting populateFacetResult");
		List<Facet> facetsList =  result.getFacets();
		if(null != facetsList) {
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
			LOG.error("Facets Mode" + facetsMode.size());
			LOG.error("Facets Selected" + selectedFacets.size());
			LOG.error("Facets Result" + facetsResult.size());
			summary.setFacetsMode(facetsMode);
			summary.setSelectedFacets(selectedFacets);
			summary.setFacetsResult(facetsResult);
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
		LOG.error("Ending populateFacetResult");	
	}
}
