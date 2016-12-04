package com.example;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.resource.AppResource;

@Component
@ApplicationPath("/services")
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig(){
		packages("com.example");
		register(AppResource.class);
	}
	
}
