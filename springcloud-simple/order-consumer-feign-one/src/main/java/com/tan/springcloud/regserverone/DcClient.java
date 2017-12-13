package com.tan.springcloud.regserverone;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client-order-service")
public interface DcClient {
	   @GetMapping("/ordercreate")
	    String consumer();
}
