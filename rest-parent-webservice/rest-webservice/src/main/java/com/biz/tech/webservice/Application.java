package com.biz.tech.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.context.ContextCleanupListener;

@SpringBootApplication(scanBasePackages="com.biz.tech")
@EntityScan("com.biz.tech.models")
@EnableJpaRepositories("com.biz.tech.repository")
public class Application extends SpringBootServletInitializer{
	
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}
	
	@Bean
	ContextCleanupListener contextCleanupListener(){
		return new ContextCleanupListener();
	}
}
