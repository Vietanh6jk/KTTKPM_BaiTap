package com.jpa.Spring_JPA_Dat_BTVN;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.jpa.Spring_JPA_Dat_BTVN.enity") 
@EnableJpaRepositories("com.jpa.Spring_JPA_Dat_BTVN.repository") 
public class SpringJpaDatBtvnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDatBtvnApplication.class, args);
	}

}
