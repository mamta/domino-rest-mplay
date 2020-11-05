package com.mamta.sl.server.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("sl")
public class MyResource {

	@GET
	@Path("user")
	@Produces(MediaType.APPLICATION_JSON)
	public String getMessage() {
		// return "Got it!";
		return null;
	}
}
