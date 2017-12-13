package com.tan.springcloud.regserverone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	    @Autowired
	    DiscoveryClient discoveryClient;

	    @GetMapping("/ordercreate")
	    public String ordercreate() {
	        String services = "Services: " + discoveryClient.getServices();
	        System.out.println(services);
	        return services;
	    }

}
