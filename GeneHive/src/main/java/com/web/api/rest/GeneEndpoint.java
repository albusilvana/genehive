package com.web.api.rest;

import com.DTO.EntryDTO;
import com.DTO.GeneDTO;
import com.Service.GenesCsvReader;
import com.google.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by silvana.albert on 6/18/15.
 */
@Path("/genes")
public class GeneEndpoint {

    private static GenesCsvReader genesCsvReader;

    @Inject
    public GeneEndpoint(GenesCsvReader genesCsvReader) {
        this.genesCsvReader = genesCsvReader;
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<GeneDTO> getAll(@QueryParam("token") String token) throws Exception {
        if (token != "") {
            List<GeneDTO> entryDTOList = genesCsvReader.getGenes();
            return entryDTOList;
        } else return null;

    }
}
