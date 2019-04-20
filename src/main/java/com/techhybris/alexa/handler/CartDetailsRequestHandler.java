package com.techhybris.alexa.handler;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.LaunchRequest;
import com.techhybris.alexa.cart.data.Cart;
import com.techhybris.alexa.cart.data.CartListData;
import com.techhybris.alexa.integration.HybrisConnectorService;
import com.techhybris.alexa.user.data.UserData;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.amazon.ask.request.Predicates.requestType;


public class CartDetailsRequestHandler extends AbstractIntentHandler {

	private Logger LOG = LoggerFactory.getLogger(CartDetailsRequestHandler.class);

	@Resource(name = "hybrisConnectorService")
	private HybrisConnectorService hybrisConnectorService;




	@Override
	protected void handleInternal(HandlerInput input) {
		String accessToken = getAccessToken(input, true);
		LOG.error("Access Token: {}", accessToken);
		CartListData cartListData = hybrisConnectorService.getCurrentCustomerCart(accessToken);
		// Setting the attribute property for data persistence.
		setSessionAttributes(input, "type", "Continue_Shopping");
		LOG.error("Cart Code: "+cartListData.getCarts().get(0).getCode());
		addModel(input, "cartListData", cartListData);
		
		//

	}

}