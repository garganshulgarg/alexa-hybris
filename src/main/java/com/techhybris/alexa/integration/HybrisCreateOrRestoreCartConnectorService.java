package com.techhybris.alexa.integration;

import com.techhybris.alexa.cart.data.Cart;

public interface HybrisCreateOrRestoreCartConnectorService {
	
	public Cart createOrRestoreCart(String accessToken);
	
}
