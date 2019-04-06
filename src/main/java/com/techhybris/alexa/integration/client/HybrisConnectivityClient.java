package com.techhybris.alexa.integration.client;

import com.techhybris.alexa.data.HybrisRequest;

public interface HybrisConnectivityClient <T> {

	public T invokeRequest(HybrisRequest request, Class<T> clazz);
}
