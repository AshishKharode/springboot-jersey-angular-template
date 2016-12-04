package com.example.exception.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class AppNullPointerExceptionMapper implements ExceptionMapper<NullPointerException>{

	@Override
	public Response toResponse(NullPointerException e) {
		String errorMsg = "Application Encounters Exception: "+e.getMessage();
		return Response.serverError().entity(errorMsg).build();
	}
}
