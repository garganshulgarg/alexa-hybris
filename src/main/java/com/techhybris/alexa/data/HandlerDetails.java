package com.techhybris.alexa.data;

import java.util.List;
import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.handler.GenericRequestHandler;

public class HandlerDetails {
	private List<GenericRequestHandler<HandlerInput, Optional<Response>>> handlerList;

	public List<GenericRequestHandler<HandlerInput, Optional<Response>>> getHandlerList() {
		return handlerList;
	}

	public void setHandlerList(List<GenericRequestHandler<HandlerInput, Optional<Response>>> handlerList) {
		this.handlerList = handlerList;
	}
	
	
}
