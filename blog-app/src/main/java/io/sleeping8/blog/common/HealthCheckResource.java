package io.sleeping8.blog.common;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HealthCheckResource {

    @GET
    @Path("/health")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Application is up and running";
    }

}