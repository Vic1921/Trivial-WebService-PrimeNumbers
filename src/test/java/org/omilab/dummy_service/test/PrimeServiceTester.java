package org.omilab.dummy_service.test;

import org.junit.Test;
import org.omilab.dummy_service.PrimeService;
import org.omilab.dummy_service.response.PrimeServiceResponse;

import java.io.IOException;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


public class PrimeServiceTester {
  public static void main(String[] args) throws IOException, InterruptedException {
  }

  @Test
  public void testGetBoundaries() {
    PrimeService primeService = new PrimeService();
    ArrayList<Integer> expectedPrimeNumbers = new ArrayList<>();
    expectedPrimeNumbers.add(2);
    expectedPrimeNumbers.add(3);
    expectedPrimeNumbers.add(5);
    expectedPrimeNumbers.add(7);

    PrimeServiceResponse response = primeService.getBoundaries(1, 10);
    ArrayList<Integer> primeNumbers = response.getResultList();

    assertEquals("Prime numbers between 1 and 10 are not as expected", expectedPrimeNumbers, primeNumbers);
  }
}
