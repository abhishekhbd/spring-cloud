package com.cloud.app.dummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DummyApp {

	public static void main(String[] args) {
		SpringApplication.run(DummyApp.class, args);
	}

}
