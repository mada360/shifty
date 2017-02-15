package com.adam.Shifty.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by adam on 15/02/17.
 */
@Provider
public class DataNotFoundMapper implements ExceptionMapper<DataNotFoundException> {

    @Override
    public Response toResponse(DataNotFoundException e) {
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
