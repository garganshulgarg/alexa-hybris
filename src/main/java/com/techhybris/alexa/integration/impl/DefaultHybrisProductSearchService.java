package com.techhybris.alexa.integration.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.techhybris.alexa.data.HybrisRequest;
import com.techhybris.alexa.integration.HybrisProductSearchService;
import com.techhybris.alexa.integration.client.HybrisConnectivityClient;
import com.techhybris.alexa.product.data.ProductSearchResult;

public class DefaultHybrisProductSearchService implements HybrisProductSearchService {

	private Logger LOG = LoggerFactory.getLogger(DefaultHybrisProductSearchService.class);
	
	
	@Resource(name="hybrisConnectivityClient")
	private HybrisConnectivityClient<ProductSearchResult> hybrisConnectivityClient;
	
	@Resource(name="hybrisConnectivityClient")
	private HybrisConnectivityClient<String> hybrisConnectivityClient1;

	@Value("${hybris.base.url}")
	private String hybrisBaseUrl;
	
	@Value("${hybris.base.site.uid}")
	private String hybrisBaseSiteUid;


	@Override
	public ProductSearchResult findProducts(String accessToken, Map<String, String> params) {
		if(StringUtils.isEmpty(accessToken))
		{
			return null;
		}				
		String url = hybrisBaseUrl + hybrisBaseSiteUid + "/products/search?query=camera&pageSize=4&fields=FULL";
		HybrisRequest request = new HybrisRequest(accessToken);
		request.setUrl(url);
		Map<String, String> postData = request.getPostData();
		postData.put("fields","FULL");
		postData.put("pageSize","1");
		postData.putAll(params);
		return hybrisConnectivityClient.invokeRequest(request, ProductSearchResult.class);
	}
	
	

}
