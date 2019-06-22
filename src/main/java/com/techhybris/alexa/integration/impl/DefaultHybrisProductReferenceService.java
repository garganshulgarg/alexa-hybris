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
import com.techhybris.alexa.integration.HybrisProductReferenceService;
import com.techhybris.alexa.integration.client.HybrisConnectivityClient;
import com.techhybris.alexa.product.references.data.ProductReferenceSearchResult;

public class DefaultHybrisProductReferenceService implements HybrisProductReferenceService{

	private static final String FIELDS = "fields";

	private static final String PAGE_SIZE = "pageSize";

	private static final String REFERENCE_TYPE = "referenceType";
	
	private static final String PRODUCT_CODE = "ProductCode";

	private Logger LOG = LoggerFactory.getLogger(DefaultHybrisProductSearchService.class);

	@Resource(name = "hybrisConnectivityClient")
	private HybrisConnectivityClient<ProductReferenceSearchResult> hybrisConnectivityClient;

	@Value("${hybris.base.url}")
	private String hybrisBaseUrl;

	@Value("${hybris.base.site.uid}")
	private String hybrisBaseSiteUid;

	@Override
	public ProductReferenceSearchResult findProductReferences(String accessToken, String productCode) {
		if (StringUtils.isEmpty(accessToken)) {
			return null;
		}
		try {
			
			URI uri = new URIBuilder(hybrisBaseUrl + hybrisBaseSiteUid + "/products/"+productCode+"/references")
										.addParameter(PAGE_SIZE, "4")
										.addParameter(REFERENCE_TYPE, "ACCESSORIES")
										.addParameter(FIELDS, "DEFAULT")
										.build();
			HybrisRequest request = new HybrisRequest(accessToken);
			request.setUrl(uri.toString());
			return hybrisConnectivityClient.invokeRequest(request, ProductReferenceSearchResult.class);

		} catch (URISyntaxException e) {
			LOG.error(e.getMessage());
			return null;
		}

	}

}
