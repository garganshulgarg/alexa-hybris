package com.techhybris.alexa.integration.client.impl;

import java.util.Arrays;

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

import com.techhybris.alexa.integration.client.HybrisConnectivityClient;

public class DefaultHybrisConnectivityClient implements HybrisConnectivityClient {

	private Logger LOG = LoggerFactory.getLogger(DefaultHybrisConnectivityClient.class);

	@Resource(name = "hybrisRestTemplate")
	private RestTemplate hybrisRestTemplate;

	@Override
	public Object getRequest(final String url, final String accessToken) {
		try {
			LOG.error(url);
			HttpEntity<?> entity = new HttpEntity(getHybrisSpecificHttpHeader(accessToken));
			ResponseEntity<Object> response = hybrisRestTemplate.exchange(url, HttpMethod.GET, entity, Object.class,
					new Object[0]);
			if (null != response.getStatusCode() && response.getStatusCode().equals(HttpStatus.OK)) {
				return response;
			}
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		return null;
	}
	
	@Override
	public Object postRequest(final String url, final String accessToken) {
		try {

			HttpEntity<?> entity = new HttpEntity(getHybrisSpecificHttpHeader(accessToken));
			ResponseEntity<Object> response = hybrisRestTemplate.exchange(url, HttpMethod.POST, entity, Object.class,
					new Object[0]);
			if (null != response.getStatusCode() && response.getStatusCode().equals(HttpStatus.OK)) {
				return response;
			}
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		return null;
	}

	private HttpHeaders getHybrisSpecificHttpHeader(final String accessToken) {
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		requestHeaders.set("charset", "UTF-8");
		requestHeaders.set("Authorization", "Bearer " + accessToken);

		return requestHeaders;
	}

}
