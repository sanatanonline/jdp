package com.example.jdp.creational.factory;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OperationTest {

  @Test
  public void testCalculate() {
    assertThat(OperationFactory.getOperation("add").calculate(2.0, 3.0)).isEqualTo(5.0);
  }
}
