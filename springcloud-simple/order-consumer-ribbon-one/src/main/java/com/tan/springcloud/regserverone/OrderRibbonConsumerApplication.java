package com.tan.springcloud.regserverone;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//http://blog.csdn.net/lc0817/article/details/54375802
@SpringBootApplication
@EnableDiscoveryClient
public class OrderRibbonConsumerApplication {

	public static void main(String[] args) {
		//SpringApplication.run(RegServerOneApplication.class, args);
		
		 new SpringApplicationBuilder(OrderRibbonConsumerApplication.class)
         .web(true).run(args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
