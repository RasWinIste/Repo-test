package com.acme.module1;

public class Module1 {

  public void coveredByUnitTest() {
    System.out.println("This method is covered by unit test");
    System.out.println("Just adding random stuff to get value");

    int var_1 = 0;
    int var_2 = 2;

    int var_3 = var_2 / var_1;
  }

  public void coveredByIntegrationTest() {
    System.out.println("This method is covered by integration test");
  }

  public void uncovered() {
    System.out.println("This method is not covered");
  }

}
