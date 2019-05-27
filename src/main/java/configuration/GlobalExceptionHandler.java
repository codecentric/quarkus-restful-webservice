package configuration;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GlobalExceptionHandler implements ExceptionMapper<Exception> {
  public Response toResponse(Exception exception) {
    return Response.status(Status.INTERNAL_SERVER_ERROR)
        .entity("An error occured").type(MediaType.TEXT_PLAIN)
        .build();
  }
}