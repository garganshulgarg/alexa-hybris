package com.techhybris.alexa.integration;

import com.techhybris.alexa.user.data.UserData;

public interface HybrisConnectorService {
	
	public String getCurrentCustomerCart(String accessToken);
	
	public UserData getUserProfile(String accessToken);

}
