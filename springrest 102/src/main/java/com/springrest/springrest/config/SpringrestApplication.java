package com.springrest.springrest.config;

import com.springrest.springrest.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.springrest.springrest"})
@EnableAutoConfiguration
@EnableJpaRepositories("com.springrest.springrest.jpaRepo")
@EntityScan("com.springrest.springrest.model")
public class SpringrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}

}
