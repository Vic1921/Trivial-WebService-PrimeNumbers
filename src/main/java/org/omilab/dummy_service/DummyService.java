package org.omilab.dummy_service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.omilab.dummy_service.response.DummyServiceReponse;
import io.swagger.annotations.Api;


@Path("/dummyservice")
@Api(tags = {"dummy operation"})
public class DummyService {

	
  /**
   * The logger makes sure that asked information is written in a file. This eases the debugging
   * process and allows to check the output values.
   */
  private Logger log = LogManager.getLogger(DummyService.class);


  /**
   * The operation demonstrates the use of annotation to implement a GET ReST Service using Java 
   * @param A
   * @param B
   * 
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("concatStringGET")
  public DummyServiceReponse concatStringGET(@QueryParam("Input_A") String A, @QueryParam("Input_B") String B) {
    log.info("command received - concatString A:" + A + " B:" + B );
    return new DummyServiceReponse(A + " " + B);
  }

    /**
   * The operation demonstrates the use of annotation to implement a GET ReST Service using Java 
   * @param A
   * @param B
   * 
   */
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Path("concatStringPOST")
  public DummyServiceReponse concatStringPOST(@QueryParam("Input_A") String A, @QueryParam("Input_B") String B) {
    log.info("command received - concatString A:" + A + " B:" + B );
    return new DummyServiceReponse(A + " " + B);
  }
}
