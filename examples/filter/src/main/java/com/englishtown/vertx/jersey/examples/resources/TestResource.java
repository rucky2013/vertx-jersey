package com.englishtown.vertx.jersey.examples.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: adriangonzalez
 * Date: 4/9/13
 * Time: 7:36 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("test")
public class TestResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String doGet() {
        return "Check response headers for X-Powered-By";
    }

}