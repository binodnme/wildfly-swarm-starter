package com.github.binodnme.demo.rs;

import com.github.binodnme.demo.service.UserService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@ApplicationScoped
@Path("")
public class TestRs {

    @Inject
    private UserService userService;

    @GET
    @Produces("text/plain")
    public Response doGet() {
        return Response.ok("Hello world").build();
    }

    @GET
    @Path("users")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
        return Response.ok().entity(userService.fetchAll()).build();
    }
}