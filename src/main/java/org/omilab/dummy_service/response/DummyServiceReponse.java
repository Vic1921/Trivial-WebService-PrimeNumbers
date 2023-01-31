package org.omilab.dummy_service.response;

import java.io.Serializable;


/**
 * Serializable indicates that the class can be converted to a bit stream and vice versa.
 * This is quite useful for saving data or sending it between different interfaces.
 * The roboter arm can execute commands and return results.
 */
public class DummyServiceReponse implements Serializable {
  private static final long serialVersionUID = 1L;
  String resultString;
  
  
  public DummyServiceReponse(String resultString) {
    this.resultString = resultString;
  }


  public void setResultString(String resultString) {
    this.resultString = resultString;
  }


  public String getResultString() {
    return resultString;
  }
}
