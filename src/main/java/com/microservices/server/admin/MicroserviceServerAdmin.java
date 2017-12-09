package com.microservices.server.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
//@EnableAZSSO
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MicroserviceServerAdmin {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceServerAdmin.class, args);
	}
}
