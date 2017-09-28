package com.web.api.rest;

import com.DTO.SearchOptionsDTO;
import com.Model.Mutation;
import com.Service.AuthenticationService;
import com.Service.MutationService;
import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import org.apache.commons.lang.StringUtils;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by silvana.albert on 05/12/15.
 */
@Path("/mutations")
public class MutationController {
    private static MutationService mutationService;
    private static AuthenticationService authenticationService;
    private final String USER_NOT_AUTHENTICATED = "The user is not authenticated in the system.";

    @Inject
    public MutationController(MutationService mutationService, AuthenticationService authenticationService) {
        MutationController.mutationService = mutationService;
        MutationController.authenticationService = authenticationService;
    }

    /**
     * @param token  the token received after successful login
     * @return a response containing the list of all mutations if the token is valid, forbidden otherwise
     */
    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllMutations(@QueryParam("token") String token) throws Exception {
        Response response;
        if (authenticationService.isUserAuthenticated(token)) {
            response = Response.ok().entity(mutationService.getAllBasicEntitiesDTO()).build();
        } else {
            response = Response.status(Response.Status.FORBIDDEN)
                    .entity(new GenericEntity<String>(USER_NOT_AUTHENTICATED) {
                    }).build();
        }
        return response;
    }

    /**
     * @param token  the token received after successful login
     * @param gender  the gender which will be used in filtering
     * @return a response containing the list of all mutations for a given gender if the token is valid, forbidden otherwise
     */
    @GET
    @Path("byGender")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEnhancedCountPerCountryByGender(@QueryParam("gender") String gender, @QueryParam("token") String token) throws Exception {
        Preconditions.checkArgument(StringUtils.isNotBlank(gender), "gender must not be empty");
        Response response;
        if (authenticationService.isUserAuthenticated(token)) {
            response = Response.ok().entity(mutationService.getEnhancedBasicEntitiesDtoByGender(gender)).build();
        } else {
            response = Response.status(Response.Status.FORBIDDEN)
                    .entity(new GenericEntity<String>(USER_NOT_AUTHENTICATED) {
                    }).build();
        }
        return response;
    }

    /**
     * @param token  the token received after successful login
     * @return a response containing the current number of mutation entries if the token is valid, forbidden otherwise
     */
    @GET
    @Path("count/total")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTotalCount(@QueryParam("token") String token) throws Exception {
        Response response;
        if (authenticationService.isUserAuthenticated(token)) {
            response = Response.ok().entity(mutationService.getMutationCount()).build();
        } else {
            response = Response.status(Response.Status.FORBIDDEN)
                    .entity(new GenericEntity<String>(USER_NOT_AUTHENTICATED) {
                    }).build();
        }
        return response;
    }

    /**
     * @param token  the token received after successful login
     * @param mutation the mutation object that needs to be persisted
     * @return a response containing the successfully created mutation if the token is valid, forbidden otherwise
     */
    @POST
    @Path("create")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createEntry(Mutation mutation, @QueryParam("token") String token) throws Exception {
        Response response;
        if (authenticationService.isUserAuthenticated(token)) {
            response = Response.ok().entity(mutationService.createMutation(mutation)).build();
        } else {
            response = Response.status(Response.Status.FORBIDDEN)
                    .entity(new GenericEntity<String>(USER_NOT_AUTHENTICATED) {
                    }).build();
        }
        return response;
    }

    /**
     * @param token  the token received after successful login
     * @param searchOptionsDTO  advanced filter object containing filters like professional exposure, locus and disorder
     * @return a response containing the mutations that match the filter if the token is valid, forbidden otherwise
     */
    @POST
    @Path("filtered")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFilteredEntries(SearchOptionsDTO searchOptionsDTO, @QueryParam("token") String token) throws Exception {
        Response response;
        if (authenticationService.isUserAuthenticated(token)) {
            response = Response.ok().entity(mutationService.getEntitiesFiltered(searchOptionsDTO)).build();
        } else {
            response = Response.status(Response.Status.FORBIDDEN)
                    .entity(new GenericEntity<String>(USER_NOT_AUTHENTICATED) {
                    }).build();
        }
        return response;
    }

    /**
     * @param token  the token received after successful login
     * @param searchOptionsDTO advanced filter object containing filters like professional exposure, locus and disorder
     * @param predictionDate value used for predicting the mutations (ex: 12/12/2020 - how many mutations that match the filters will exist in 2020)
     * @return a response containing the predicted mutations that match the filter if the token is valid, forbidden otherwise
     */
    @POST
    @Path("predicted")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFilteredPredictedEntries(@QueryParam("prediction_date") String predictionDate, SearchOptionsDTO searchOptionsDTO, @QueryParam("token") String token) throws Exception {
        Response response;
        if (authenticationService.isUserAuthenticated(token)) {
            response = Response.ok().entity(mutationService.getPredictedResults(searchOptionsDTO, predictionDate)).build();
        } else {
            response = Response.status(Response.Status.FORBIDDEN)
                    .entity(new GenericEntity<String>(USER_NOT_AUTHENTICATED) {
                    }).build();
        }
        return response;
    }
}
