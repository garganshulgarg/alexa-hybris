package com.techhybris.alexa.integration;

import com.techhybris.alexa.cartmodification.data.CartModificationData;

public interface HybrisAddToCartConnectorService {
	
	public CartModificationData addToCart(String productCode,String accessToken);
	
}
