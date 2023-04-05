package org.omilab.dummy_service;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.omilab.dummy_service.response.PrimeServiceResponse;
import io.swagger.annotations.Api;


@Path("/prime")
@Api(tags = {"dummy operation"})
public class PrimeService {
  private Logger log = LogManager.getLogger(PrimeService.class);


  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("boundaries")
  public PrimeServiceResponse getBoundaries(@QueryParam("Input_A") int A, @QueryParam("Input_B") int B) {
    log.info("Numbers received -> A:" + A + " B:" + B );

    ArrayList<Integer> primeNumbers = new ArrayList<>();
    for (int i = A; i <= B; i++) {
      if (isPrime(i)) {
        primeNumbers.add(i);
      }
    }

    return new PrimeServiceResponse(primeNumbers);
  }

  private boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }


    /**
   * The operation demonstrates the use of annotation to implement a GET ReST Service using Java 
   * @param A
   * @param B
   * 
   */
  /*@POST
  @Produces(MediaType.APPLICATION_JSON)
  @Path("concatStringPOST")
  public PrimeServiceResponse concatStringPOST(@QueryParam("Input_A") int A, @QueryParam("Input_B") int B) {
    log.info("Numbers received -> A:" + A + " B:" + B );

    return new PrimeServiceResponse(A + " " + B);
  }*/
}
