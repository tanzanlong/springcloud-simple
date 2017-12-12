package com.tan.springcloud.regserverone;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderServiceOneApplication {

	public static void main(String[] args) {
		//SpringApplication.run(OrderServiceOneApplication.class, args);
		 new SpringApplicationBuilder(
				 OrderServiceOneApplication.class)
		            .web(true).run(args);
	}
}
