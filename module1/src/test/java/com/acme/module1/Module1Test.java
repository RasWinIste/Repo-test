package com.acme.module1;

import org.junit.Test;

public class Module1Test {

  @Test
  public void coveredByUnitTest() {
    Module1 module1 = new Module1();

    System.out.println("Juste un test");
    int var0 = 1;
    int var1 = 3;

    int var2 = var1 / var0;
    
    module1.coveredByUnitTest();
  }
}
