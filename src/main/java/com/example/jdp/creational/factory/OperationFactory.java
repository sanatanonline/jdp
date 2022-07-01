package com.example.jdp.creational.factory;

public class OperationFactory {

  public static Operation getOperation(String op) {
    Operation operation = null;
    if ("add".equals(op)) {
      operation = new Addition();
    } else if ("sub".equals(op)) {
      operation = new Subtraction();
    } else if ("mul".equals(op)) {
      operation = new Multiplication();
    } else if ("div".equals(op)) {
      operation = new Division();
    }
    return operation;
  }
}
