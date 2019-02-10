package com.techhybris.alexa.integration.gateway;

import org.springframework.integration.annotation.Gateway;

/**
 * The purpose of this Gateway is just for testing and learning the concept of 
 * making Rest Calls using Spring Integration.
 * @author Anshul.Garg
 *
 */
public interface TestRestGateway {

	@Gateway(requestChannel="testServiceRequestChannel", replyChannel="testServiceResponseChannel")
	String testGetRequestGateway(String testMessage);
}
