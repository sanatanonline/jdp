package com.example.jdp.creational.factory;

public class TestOperation {
  public static void main(String[] args) {
    Operation op1 = new Addition();
    double result1 = op1.calculate(2.0, 3.0);
    System.out.println("Result1 = " + result1);

    Operation op2 = new Subtraction();
    double result2 = op2.calculate(2.0, 3.0);
    System.out.println("Result2 = " + result2);

    double result3 = OperationFactory.getOperation("add").calculate(2.0, 3.0);
    System.out.println("Result3 = " + result3);
  }
}
