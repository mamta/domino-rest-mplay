package com.mamta.sl.client.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dominokit.domino.rest.shared.request.service.annotations.RequestFactory;

@RequestFactory
@Path("user")
public interface UserServiceClient {

    @GET
    @Path("")
    String getMessage();

}
