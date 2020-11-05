package com.mamta.sl.server.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mamta.sl.shared.User;

@Path("sl")
public class MyResource {

	@GET
	@Path("message")
	@Produces(MediaType.APPLICATION_JSON)
	public String getMessage() {
		return "Got it!";
		// return null;
	}

	@GET
	@Path("user")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser() {
		User user = new User();
		user.setName("Mamta");
		user = null;
		if (user == null) {
			return Response.status(404).build();
		} else {
			return Response.ok().entity(user).build();
		}
	}
}
