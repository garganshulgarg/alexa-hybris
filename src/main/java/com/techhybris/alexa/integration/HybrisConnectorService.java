package com.techhybris.alexa.integration;

import com.techhybris.alexa.cart.data.CartListData;
import com.techhybris.alexa.user.data.UserData;

public interface HybrisConnectorService {
	
	public CartListData getCurrentCustomerCart(String accessToken);
	
	public UserData getUserProfile(String accessToken);

}
