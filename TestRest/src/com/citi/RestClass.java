package com.citi;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("generic")
public class RestClass {
    @SuppressWarnings("unused")
    @Context
    private UriInfo context;

    /**
     * Default constructor. 
     */
    public RestClass() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Retrieves representation of an instance of RestClass
     * @return an instance of String
     */
    @GET
    @Produces("text/plain")
    public String getText() {
        // TODO return proper representation object
        //throw new UnsupportedOperationException();
    	return "Hello World";
    }

    /**
     * PUT method for updating or creating an instance of RestClass
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
    }

}