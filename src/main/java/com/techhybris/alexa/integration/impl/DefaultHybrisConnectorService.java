package com.techhybris.alexa.integration.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.techhybris.alexa.data.HybrisRequest;
import com.techhybris.alexa.integration.HybrisConnectorService;
import com.techhybris.alexa.integration.client.HybrisConnectivityClient;
import com.techhybris.alexa.user.data.UserData;

public class DefaultHybrisConnectorService implements HybrisConnectorService {
	private Logger LOG = LoggerFactory.getLogger(DefaultHybrisConnectorService.class);
	
	
	@Resource(name="hybrisConnectivityClient")
	private HybrisConnectivityClient<UserData> hybrisConnectivityClient;

	@Resource(name="hybrisConnectivityClient")
	private HybrisConnectivityClient<String> hybrisCartClient;

	@Value("${hybris.base.url}")
	private String hybrisBaseUrl;
	
	@Value("${hybris.base.site.uid}")
	private String hybrisBaseSiteUid;
	
	
	@Override
	public String getCurrentCustomerCart(String accessToken) {
		if(StringUtils.isEmpty(accessToken))
		{
			return null;
		}				
		String url = hybrisBaseUrl + hybrisBaseSiteUid + "/users/current/carts";
		HybrisRequest request = new HybrisRequest(accessToken);
		request.setUrl(url);
		Map<String, String> params = request.getPostData();
		params.put("fields","BASIC");
		params.put("savedCartsOnly","false");
		params.put("pageSize","20");
		return hybrisCartClient.invokeRequest(request, String.class);
	}

	@Override
	public UserData getUserProfile(String accessToken) {
		if(StringUtils.isEmpty(accessToken))
		{
			return null;
		}				
		String url = hybrisBaseUrl + hybrisBaseSiteUid + "/users/current";
		HybrisRequest request = new HybrisRequest(accessToken);
		request.setUrl(url);
		Map<String, String> params = request.getPostData();
		params.put("fields","BASIC");
		return hybrisConnectivityClient.invokeRequest(request, UserData.class);
		
	}
}
