package com.web.api.rest;

import com.Service.PatientService;
import com.google.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by silvana.albert on 3/11/15.
 */
@Path("/patients")
public class PatientEndpoint {

    public static final String NO_LICENSOR_WAS_FOUND = "No licensor was found!";
    private final PatientService patientService;

    @Inject
    public PatientEndpoint(PatientService patientService) {
        this.patientService = patientService;
    }

//    @GET
//    @Path("{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getLicensor(@PathParam("id") long id) {
//        Preconditions.checkArgument(id > 0, "Invalid query param, id should be positive");
//        Response response;
//        LicensorDTO licensor = licensorService.find(id);
//        if (licensor == null) {
//            response = Response.status(Response.Status.NO_CONTENT)
//                    .entity(new GenericEntity<String>(NO_LICENSOR_WAS_FOUND) {
//                    }).build();
//        } else {
//            response = Response.ok().entity(Entry).build();
//        }
//        return response;
//    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPatients(@QueryParam("items_per_page") int itemsPerPage,
                                    @QueryParam("page_nr") int pageNr,
                                    @QueryParam("filter_value") String filterValue,
                                    @QueryParam("filter_columns") List<String> filterColumns) {
//        Preconditions.checkArgument(pageNr >= 0, "Invalid query param, pageNr should be positive");
//        Preconditions.checkArgument(itemsPerPage > 0, "Invalid query param, itemsPerPage should be greater than 0");
        Response response = null;
//        EntityBaseDTOs licensorList = licensorService.findAllFiltered(itemsPerPage, pageNr, new SearchAttributes(filterColumns, filterValue));
//        if (licensorList == null || licensorList.getEntityList() == null || licensorList.getEntityList().isEmpty()) {
//            response = Response.status(Response.Status.NO_CONTENT)
//                    .entity(new GenericEntity<String>(NO_LICENSOR_WAS_FOUND) {
//                    }).build();
//        } else {
//            response = Response.ok().entity(licensorList).build();
//        }
        return response;
    }

}