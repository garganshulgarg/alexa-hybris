package com.techhybris.alexa.integration.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.http.client.utils.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;

import com.techhybris.alexa.cartmodification.data.CartModificationData;
import com.techhybris.alexa.data.HybrisRequest;
import com.techhybris.alexa.integration.HybrisAddToCartConnectorService;
import com.techhybris.alexa.integration.client.HybrisConnectivityClient;
import com.techhybris.alexa.orderentry.data.OrderEntryData;
import com.techhybris.alexa.orderentry.data.Product;

public class DefaultHybrisAddToCartConnectorService implements HybrisAddToCartConnectorService {

	private Logger LOG = LoggerFactory.getLogger(DefaultHybrisAddToCartConnectorService.class);

	@Resource(name="hybrisConnectivityClient")
	private HybrisConnectivityClient<CartModificationData> hybrisCartClient;

	@Value("${hybris.base.url}")
	private String hybrisBaseUrl;

	@Value("${hybris.base.site.uid}")
	private String hybrisBaseSiteUid;
	
	private static final String PRODUCT="product";

	@Override
	public CartModificationData addToCart(String productCode,String accessToken) {
		if(StringUtils.isEmpty(accessToken))
		{
			return null;
		}
		try {
			URI uri = new URIBuilder(hybrisBaseUrl + hybrisBaseSiteUid + "/users/current/carts/current/entries")
											.build();
			HybrisRequest request = new HybrisRequest(accessToken);
			request.setUrl(uri.toString());
			request.setMethod(HttpMethod.POST);
			Map<String, OrderEntryData> map=new HashMap();
			OrderEntryData oed=new OrderEntryData();
			Product product=new Product();
			product.setCode(productCode);
			oed.setProduct(product);
			map.put(PRODUCT, oed );
			request.setPostData(map);
			return hybrisCartClient.invokeRequest(request, CartModificationData.class);

		} catch (URISyntaxException e) {
			LOG.error(e.getMessage());
			return null;
		}
	}

	

}
