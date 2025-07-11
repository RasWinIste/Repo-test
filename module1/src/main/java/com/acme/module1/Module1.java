package com.acme.module1;

public class Module1 {

  public void coveredByUnitTest() {
    System.out.println("This method is covered by unit test");
    // Some updates
    int var = 3;
    int result = 4 / var;

    System.out.println("The result: " + result);
  }

  public void coveredByIntegrationTest() {
    System.out.println("This method is covered by integration test");
  }

  public void uncovered() {
    System.out.println("This method is not covered");
  }

}
