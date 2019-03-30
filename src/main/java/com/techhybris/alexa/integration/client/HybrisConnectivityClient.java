package com.techhybris.alexa.integration.client;

public interface HybrisConnectivityClient {

	public Object getRequest(final String url, final String accessToken);
	public Object postRequest(final String url, final String accessToken);
}
