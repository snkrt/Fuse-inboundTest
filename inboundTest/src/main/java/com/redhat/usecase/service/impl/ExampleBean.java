package com.redhat.usecase.service.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public class ExampleBean {
    @GET
    @Path("/")
    public String ping() throws Exception {
        return "SUCCESS";
    }
}
