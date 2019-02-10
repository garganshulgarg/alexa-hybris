package com.techhybris.alexa.integration.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.techhybris.alexa.integration.HybrisConnectorService;
import com.techhybris.alexa.integration.gateway.TestRestGateway;

public class DefaultHybrisConnectorService implements HybrisConnectorService {
	private Logger LOG = LoggerFactory.getLogger(DefaultHybrisConnectorService.class);
	
	@Resource(name="testRestGateway")
	private TestRestGateway testRestGateway;

	@Override
	public String testRestServices() {
		
		LOG.error(testRestGateway.testGetRequestGateway("test-message-payload"));
		
		return "Test Successful by Anshul Garg";
	}

}
