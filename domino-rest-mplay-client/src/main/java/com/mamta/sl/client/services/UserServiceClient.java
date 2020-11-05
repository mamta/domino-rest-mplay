package com.mamta.sl.client.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dominokit.domino.rest.shared.request.service.annotations.RequestFactory;

import com.mamta.sl.shared.User;

@RequestFactory
@Path("")
public interface UserServiceClient {

    @GET
    @Path("message")
    String getMessage();
    
    @GET
    @Path("user")
    User getUser();

}
