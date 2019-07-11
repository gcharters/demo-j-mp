package dev.appsody.starter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
 

@Path("message")
public class MyResource {

    @GET
    public String getMessage() {
        return "Some like it hot!";
    }
}
