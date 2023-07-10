package ch.zli.m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calc")
public class GreetingResource {
    @GET
    @Path("/{x}/{y}")
    @Produces(MediaType.TEXT_PLAIN)
    public int calc(@PathParam("x") int x, @PathParam("y") int y) {
        return x + y;
    }
}
