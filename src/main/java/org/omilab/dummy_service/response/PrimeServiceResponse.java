package org.omilab.dummy_service.response;

import java.io.Serializable;
import java.util.ArrayList;


public class PrimeServiceResponse implements Serializable {
  private static final long serialVersionUID = 1L;
  private ArrayList<Integer> resultList;
  
  public PrimeServiceResponse(ArrayList<Integer> resultList) {
    this.resultList = resultList;
  }

  public ArrayList<Integer> getResultList() {
    return resultList;
  }

  public void setResultList(ArrayList<Integer> resultList) {
    this.resultList = resultList;
  }
}
