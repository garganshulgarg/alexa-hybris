package com.techhybris.alexa.integration.client.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.techhybris.alexa.data.HybrisRequest;
import com.techhybris.alexa.integration.client.HybrisConnectivityClient;

public class DefaultHybrisConnectivityClient<T> implements HybrisConnectivityClient {

	private Logger LOG = LoggerFactory.getLogger(DefaultHybrisConnectivityClient.class);

	@Resource(name = "hybrisRestTemplate")
	private RestTemplate hybrisRestTemplate;

	private static final String PRODUCT="product";
	@Override
	public Object invokeRequest(HybrisRequest request, Class clazz) {
		try {
			LOG.error(request.getUrl());
			HttpEntity<?> entity;
			if(null!=request.getPostData()) {
				entity = new HttpEntity(request.getPostData().get(PRODUCT),getHybrisSpecificHttpHeader(request));	
			}
			else {
			    entity = new HttpEntity(getHybrisSpecificHttpHeader(request));	
			}
			ResponseEntity<T> response = hybrisRestTemplate.exchange(request.getUrl(), request.getMethod(), entity, clazz);
			if (null != response.getStatusCode() && response.getStatusCode().equals(HttpStatus.OK)) {
				return response.getBody();
			}
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		return null;

	}
	private HttpHeaders getHybrisSpecificHttpHeader(HybrisRequest request) {
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		Map<String, String> headers = request.getHeaders();
		for(String key : headers.keySet()) {
			requestHeaders.set(key, headers.get(key));
		}
		return requestHeaders;
	}

}
