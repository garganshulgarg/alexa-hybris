package com.techhybris.alexa.integration.impl;

import java.net.URI;
import java.net.URISyntaxException;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.http.client.utils.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.techhybris.alexa.data.HybrisRequest;
import com.techhybris.alexa.integration.HybrisConnectorService;
import com.techhybris.alexa.integration.client.HybrisConnectivityClient;
import com.techhybris.alexa.user.data.UserData;

public class DefaultHybrisConnectorService implements HybrisConnectorService {
	
	private static final String FIELDS = "fields";
	private static final String PAGE_SIZE = "pageSize";
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
		
		try {
			URI uri = new URIBuilder(hybrisBaseUrl + hybrisBaseSiteUid + "/users/current/carts")
											.addParameter(FIELDS, "FULL")
											.addParameter(PAGE_SIZE, "20")
											.build();
			HybrisRequest request = new HybrisRequest(accessToken);
			request.setUrl(uri.toString());
			return hybrisCartClient.invokeRequest(request, String.class);

		} catch (URISyntaxException e) {
			LOG.error(e.getMessage());
			return null;
		}
		
	}

	@Override
	public UserData getUserProfile(String accessToken) {
		if(StringUtils.isEmpty(accessToken))
		{
			return null;
		}
		try {
			URI uri = new URIBuilder(hybrisBaseUrl + hybrisBaseSiteUid + "/users/current")
											.addParameter(FIELDS, "FULL")
											.build();
			HybrisRequest request = new HybrisRequest(accessToken);
			request.setUrl(uri.toString());
			return hybrisConnectivityClient.invokeRequest(request, UserData.class);

		} catch (URISyntaxException e) {
			LOG.error(e.getMessage());
			return null;
		}
		
		
	}
}
