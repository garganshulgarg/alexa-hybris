package com.techhybris.alexa.integration.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.http.client.utils.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.techhybris.alexa.data.HybrisRequest;
import com.techhybris.alexa.integration.HybrisProductSearchService;
import com.techhybris.alexa.integration.client.HybrisConnectivityClient;
import com.techhybris.alexa.product.data.ProductSearchResult;

public class DefaultHybrisProductSearchService implements HybrisProductSearchService {

	private static final String FIELDS = "fields";

	private static final String PAGE_SIZE = "pageSize";

	private static final String QUERY = "query";

	private Logger LOG = LoggerFactory.getLogger(DefaultHybrisProductSearchService.class);

	@Resource(name = "hybrisConnectivityClient")
	private HybrisConnectivityClient<ProductSearchResult> hybrisConnectivityClient;

	@Resource(name = "hybrisConnectivityClient")
	private HybrisConnectivityClient<String> hybrisConnectivityClient1;

	@Value("${hybris.base.url}")
	private String hybrisBaseUrl;

	@Value("${hybris.base.site.uid}")
	private String hybrisBaseSiteUid;

	@Override
	public ProductSearchResult findProducts(String accessToken, Map<String, String> params) {
		if (StringUtils.isEmpty(accessToken)) {
			return null;
		}
		try {
			URI uri = new URIBuilder(hybrisBaseUrl + hybrisBaseSiteUid + "/products/search")
										.addParameter(QUERY, null != params && null!=params.get(QUERY) ? params.get(QUERY) :StringUtils.EMPTY)
										.addParameter(PAGE_SIZE, "4")
										.addParameter(FIELDS, "FULL")
										.build();
			HybrisRequest request = new HybrisRequest(accessToken);
			request.setUrl(uri.toString());
			return hybrisConnectivityClient.invokeRequest(request, ProductSearchResult.class);

		} catch (URISyntaxException e) {
			LOG.error(e.getMessage());
			return null;
		}

	}

}
