package com.techhybris.alexa.integration.impl;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.techhybris.alexa.integration.HybrisConnectorService;
import com.techhybris.alexa.integration.client.HybrisConnectivityClient;

public class DefaultHybrisConnectorService implements HybrisConnectorService {
	private Logger LOG = LoggerFactory.getLogger(DefaultHybrisConnectorService.class);
	
	
	@Resource(name="hybrisConnectivityClient")
	private HybrisConnectivityClient hybrisConnectivityClient;
	
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
		String url = hybrisBaseUrl + hybrisBaseSiteUid + "/users/current/carts?fields=FULL&savedCartsOnly=false&pageSize=20";
		return hybrisConnectivityClient.getRequest(url, accessToken).toString();
	}

}
