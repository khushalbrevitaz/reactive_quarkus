package org.acme.controller;

import io.smallrye.common.annotation.NonBlocking;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.entity.User;
import org.acme.service.UserService;

@Path("/rest")
public class UserResource {
    @Inject
    UserService userService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/users")
    public Uni<User> getUser() {
        return userService.getUser();
    }

}
