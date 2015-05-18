package com.web.api.rest;

import com.DTO.BasicEntityDTO;
import com.DTO.EntryDTO;
import com.Model.Entry;
import com.Service.EntryService;
import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by silvana.albert on 4/13/15.
 */
@Path("/entries")
public class EntryEndpoint {
    private static EntryService entryService;

    @Inject
    public EntryEndpoint(EntryService entryService) {
        this.entryService = entryService;
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<EntryDTO>  getAll() throws Exception {
        List<EntryDTO> entryDTOList = entryService.getAllEntries();
        return entryDTOList;
    }

    @GET
    @Path("count/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BasicEntityDTO>  getCountPerCountry() throws Exception {
        List<BasicEntityDTO> entryDTOList = entryService.getAllBasicEntitiesDTO();
        return entryDTOList;
    }

}
