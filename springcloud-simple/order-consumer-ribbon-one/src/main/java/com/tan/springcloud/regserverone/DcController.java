package com.tan.springcloud.regserverone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class DcController {
	    @Autowired
	    LoadBalancerClient loadBalancerClient;
	    @Autowired
	    RestTemplate restTemplate;

	  /*  @GetMapping("/consumer")
	    public String ordercreate() {
	        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client-order-service");
	        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/ordercreate";
	        System.out.println(url);
	        return restTemplate.getForObject(url, String.class);
	    }*/
	    
	    @GetMapping("/consumer")
	    public String dc() {
	        return restTemplate.getForObject("http://eureka-client-order-service/ordercreate", String.class);
	    }

}
