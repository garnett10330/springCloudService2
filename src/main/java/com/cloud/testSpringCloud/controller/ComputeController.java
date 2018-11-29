package com.cloud.testSpringCloud.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {
	 private final Logger logger = Logger.getLogger(ComputeController.class);

	    @Autowired
	    private DiscoveryClient discoveryClient;

	    @RequestMapping("/dc")
	    public String dc() {
	    	String services = "Services: " + discoveryClient.getServices();
	    	logger.info(services);
	        return services;
	    }

}
