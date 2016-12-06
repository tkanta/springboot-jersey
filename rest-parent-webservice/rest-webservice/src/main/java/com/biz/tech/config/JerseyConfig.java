package com.biz.tech.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.biz.tech.controller.EmployeeController;

@Configuration
@ApplicationPath("/dashboard")
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig(){
		register(EmployeeController.class);
	}
	
}
