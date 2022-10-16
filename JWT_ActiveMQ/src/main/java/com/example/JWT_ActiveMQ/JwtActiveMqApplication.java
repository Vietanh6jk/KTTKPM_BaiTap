package com.example.JWT_ActiveMQ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class JwtActiveMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtActiveMqApplication.class, args);
	}

}
