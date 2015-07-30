package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("say")
public interface HelloRestService {

    @GET
    @Path("hello/{name}") //Maps for the `hello/John` in the URL
    public String handleGet(@PathParam("name") String name);

}
