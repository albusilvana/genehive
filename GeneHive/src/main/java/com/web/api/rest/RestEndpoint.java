package com.web.api.rest;

import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

/**
 * The RestEndpoint can be used as a superclass of an Endpoint class in order to provide convenience functions that
 * create Responses of different types. Empty responses can be created (used when replying to an OPTIONS request which
 * has no body). OK responses can be created which have the correct status set and the entity passed in built.
 * NO_CONTENT responses can be created with the correct message.
 *
 * @author shalsey
 * @since NewsRight 1.8
 */

public class RestEndpoint {

    /* Creates an OK response with no body.
     *
     * @return a Response with no body. */
    protected Response emptyOkResponse() {
        return okResponse(null);
    }

    /* Creates an OK Response using objectToReturn to generate the JSON body.
     *
     * @param the object to use to generate the JSON response body.
     *
     * @return the Response */
    protected Response okResponseUsing(Object objectToReturn) {
        if (objectToReturn == null) {
            return emptyJsonArrayOkResponse();
        } else {
            return okResponse(objectToReturn);
        }
    }

    /* Creates an NO_CONTENT Response using the message provided as the body.
     *
     * @param the message to display in the response to the user.
     *
     * @return the Response */
    protected Response noContentResponseWithMessage(String message) {
        GenericEntity<String> objectToReturn = new GenericEntity<String>(message) {
        };
        return buildResponse(Response.Status.NO_CONTENT, objectToReturn);
    }

    private Response okResponse(Object objectToReturn) {
        return buildResponse(Response.Status.OK, objectToReturn);
    }

    private Response emptyJsonArrayOkResponse() {
        Object[] emptyArray = new Object[0];
        return okResponse(emptyArray);
    }

    private Response buildResponse(Status status, Object objectToReturn) {
        ResponseBuilder responseBuilder = Response.status(status);
        return responseBuilder.entity(objectToReturn).build();
    }
}
