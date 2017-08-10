package com.learning.springboot.metrics;

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
public class MetricsApplication {
	public static void main(String[] args) {
		SpringApplication.run(MetricsApplication.class, args);
	}
}
