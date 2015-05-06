package com.web.api.rest;

import com.Service.DiagnosticService;
import com.google.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by silvana.albert on 5/6/15.
 */
@Path("/diagnostics")
public class DiagnosticEndpoint {

    private static DiagnosticService diagnosticService;

    @Inject
    public DiagnosticEndpoint(DiagnosticService diagnosticService) {
        this.diagnosticService = diagnosticService;
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getAllDiagnostics() throws Exception {
        List<String> diagnostics = diagnosticService.getAllDiagnostics();
        return diagnostics;
    }
}
