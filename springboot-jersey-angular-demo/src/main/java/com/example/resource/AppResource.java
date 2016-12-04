package com.example.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.manager.AppManager;

@Component
@Path("/apis")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AppResource {

	@Autowired
	private AppManager manager;
	
	@GET
	@Path("/message")
	public Response getMessage(){
		List<String> msgs = manager.getMessages();
		return Response.ok(msgs).build();
	}
	
	@GET
	@Path("/exception")
	public String getException(){
		throw new NullPointerException("NullPointerException !!!");
	}
}
