package com.acme.module1;

public class Module1 {

  public void coveredByUnitTest() {
    System.out.println("This method is covered by unit test");
    
    System.out.println("By pr for testing SonarCloud new line coverage");

    System.out.println("Calculating Fibonacci just for fun");
    int n = 10, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }

    int var_0 = 1;
    int var_1 = 2;
    int var_3 = var_0 - var_1;

    System.out.print("Calculating for fun : " + var_3);
    System.out.print("Hope you like this test");

    int var_4 = 1;
    int var_5 = 2;
    int var_6 = var_4 - var_5;

    System.out.print("Calculating for fun : " + var_3);
    System.out.print("Hope you like this test");
  }

  public void coveredByIntegrationTest() {
    System.out.println("This method is covered by integration test");
  }

  public void uncovered() {
    System.out.println("This method is not covered");
  }

}
