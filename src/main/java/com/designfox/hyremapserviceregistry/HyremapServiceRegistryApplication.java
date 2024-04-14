package com.designfox.hyremapserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HyremapServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyremapServiceRegistryApplication.class, args);
	}

}
