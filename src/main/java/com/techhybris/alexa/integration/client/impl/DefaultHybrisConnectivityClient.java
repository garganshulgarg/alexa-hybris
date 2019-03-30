package com.techhybris.alexa.integration.client.impl;

import java.io.StringWriter;
import java.util.Arrays;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.techhybris.alexa.integration.client.HybrisConnectivityClient;

public class DefaultHybrisConnectivityClient implements HybrisConnectivityClient{

	private Logger LOG = LoggerFactory.getLogger(DefaultHybrisConnectivityClient.class);
	
	@Resource(name="hybrisRestTemplate")
	private RestTemplate hybrisRestTemplate;
	
	@Override
	public Object makeGetRequest(final String url, final String accessToken) {
		LOG.error(url);
		 try {
             HttpHeaders requestHeaders = new HttpHeaders();
             requestHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
             requestHeaders.set("charset", "UTF-8");
             requestHeaders.set("Authorization", "Bearer " + accessToken);
             StringWriter sw = new StringWriter();
             HttpEntity<?> entity = new HttpEntity(sw.toString(), requestHeaders);
             ResponseEntity<Object> response = hybrisRestTemplate.exchange(url, HttpMethod.GET, entity, Object.class, new Object[0]);
             if(null != response.getStatusCode()) {
            	 LOG.error(response.getStatusCode().name());
             }
             return response;
		 }catch (Exception e) {
			LOG.error(e.getMessage());
		}
		 return null;
	}
	
	
	
	
	
}
