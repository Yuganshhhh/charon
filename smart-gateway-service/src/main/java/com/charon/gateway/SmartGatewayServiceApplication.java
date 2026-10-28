package com.charon.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SmartGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartGatewayServiceApplication.class, args);
	}

}
