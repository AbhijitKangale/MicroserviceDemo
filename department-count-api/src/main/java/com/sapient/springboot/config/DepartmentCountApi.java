package com.sapient.springboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = { "com.sapient.springboot.*" })
@EnableEurekaClient
public class DepartmentCountApi {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentCountApi.class, args);
	}
}
