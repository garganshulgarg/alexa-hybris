package com.techhybris.alexa.data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpMethod;


public class HybrisRequest {

	private String url;
	private Map<String, String> headers;
	private Map<String, String> postData;
	
	public HybrisRequest(final String accessToken) {
		method = HttpMethod.GET;
		headers = new HashMap<String, String>();
		headers.put("charset", "UTF-8");
		headers.put("Authorization", "Bearer " + accessToken);
		postData = new HashMap<String, String>();
	}

	public HttpMethod getMethod() {
		return method;
	}

	public void setMethod(HttpMethod method) {
		this.method = method;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	public Map<String, String> getPostData() {
		return postData;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
