package com.tan.springcloud.regserverone;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
//http://blog.csdn.net/lc0817/article/details/54375802
@Configuration
@EnableAutoConfiguration
@EnableTurbine
@EnableDiscoveryClient
public class HystrixDashboardApplication {

	public static void main(String[] args) {
		//SpringApplication.run(RegServerOneApplication.class, args);
		
		 new SpringApplicationBuilder(HystrixDashboardApplication.class)
         .web(true).run(args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
