package com.gvaramaraju;

import io.micronaut.runtime.Micronaut;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }

    @Path("/greet")
    @GET
    public String greet(){
        return "Hello World!!";
    }
}
