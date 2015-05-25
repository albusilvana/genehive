package com.web.api.rest;

import com.Service.AuthenticationService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by silvana.albert on 5/25/15.
 */
@Path("/authenticate")
public class AuthenticationEndpoint {
    private AuthenticationService authenticationService = new AuthenticationService();
    @GET
    @Path("withCredentials/")
    public String getToken(@QueryParam("username") String username, @QueryParam("password") String password) throws Exception {
        return authenticationService.authenticate(username, password);
    }
}
