package com.microservices.server.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@EnableEurekaClient
//@EnableAZSSO
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MicroserviceServerAdmin {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceServerAdmin.class, args);
	}
}
