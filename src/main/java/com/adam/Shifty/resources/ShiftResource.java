package com.adam.Shifty.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by adam on 15/02/17.
 */
@Path("/")
public class ShiftResource {

    @GET
    public String test(){
        return "This is a shift";
    }

}
