package com.web.api.rest;

import com.DTO.BasicEntityDTO;
import com.DTO.EnhancedBasicEntityDTO;
import com.DTO.EntryDTO;
import com.DTO.EntryFromUIDTO;
import com.Model.Entry;
import com.Service.EntryService;
import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import javax.ws.rs.*;
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
    public List<EntryDTO> getAll(@QueryParam("token") String token) throws Exception {
        if (token != "") {
            List<EntryDTO> entryDTOList = entryService.getAllEntries();
            return entryDTOList;
        } else return null;

    }

    @GET
    @Path("count/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BasicEntityDTO> getCountPerCountry(@QueryParam("token") String token) throws Exception {
        if (token != "") {
            List<BasicEntityDTO> entryDTOList = entryService.getAllBasicEntitiesDTO();
            return entryDTOList;
        } else return null;
    }

    @GET
    @Path("count/enhanced/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<EnhancedBasicEntityDTO> getEnhancedCountPerCountry(@QueryParam("token") String token) throws Exception {
        if( token != ""){
            List<EnhancedBasicEntityDTO> entryDTOList = entryService.getAllEnhancedEntitiesDTO();
            return entryDTOList;
        } else return null;
    }

    @GET
    @Path("count/enhanced/byGender")
    @Produces(MediaType.APPLICATION_JSON)
    public List<EnhancedBasicEntityDTO> getEnhancedCountPerCountryByGender(@QueryParam("gender") String gender, @QueryParam("token") String token) throws Exception {
        if (token != "") {
            List<EnhancedBasicEntityDTO> entryDTOList = entryService.getEnhancedBasicEntitiesDtoByGender(gender);
            return entryDTOList;
        } else return null;
    }

    @GET
    @Path("count/byGender")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BasicEntityDTO> getCountPerCountryByGender(@QueryParam("gender") String gender, @QueryParam("token") String token) throws Exception {
        if (token != "") {
            List<BasicEntityDTO> entryDTOList = entryService.getAllEntitiesByGender(gender);
            return entryDTOList;
        } else {
            return null;
        }
    }

    @GET
    @Path("total/all")
    @Produces(MediaType.APPLICATION_JSON)
    public long getTotalCount( @QueryParam("token") String token) throws Exception {
        if (token != "") {
           long no = entryService.getMutationCount();
            return no;
        } else {
            return 0;
        }
    }

    @POST
    @Path("create")
    @Consumes(MediaType.APPLICATION_JSON)
    public String createEntry(EntryFromUIDTO entryFromUIDTO, @QueryParam("token") String token) throws Exception {
        String resp = entryService.insertEntry(entryFromUIDTO.getName(), entryFromUIDTO.getIdentificationNumber(),
                entryFromUIDTO.getCountryCode(), entryFromUIDTO.getDateOfBirth(), entryFromUIDTO.getDateOfDiagnosis(),
                entryFromUIDTO.getDateOfDeath(), entryFromUIDTO.getGender(), entryFromUIDTO.getProfessionalExposure(),
                entryFromUIDTO.getDetails(), entryFromUIDTO.getMutationEntries(), entryFromUIDTO.getPhysitian());
        return resp;
    }



//    sample json
//{
//    "name": "'Alb Sil'",
//        "identificationNumber": "'2060834180047'",
//        "countryCode": "'TH'",
//        "dateOfBirth": "548704651",
//        "dateOfDiagnosis": "790564739",
//        "dateOfDeath": "1332594706",
//        "gender": "'F'",
//        "professionalExposure": "'Beryllium_356740475360000000'",
//        "details": "'some details'",
//        "mutationEntries": "'KIF5C_KCND3_Nasopharynx Carcinoma'",
//        "physitian": "'Suzanna Amar'"
//}
}
