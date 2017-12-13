package com.tan.springcloud.regserverone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DcController {
	  /*  @GetMapping("/consumer")
	    public String ordercreate() {
	        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client-order-service");
	        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/ordercreate";
	        System.out.println(url);
	        return restTemplate.getForObject(url, String.class);
	    }*/
	    
	@Autowired
    ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc() {
        return consumerService.consumer();
    }


}
