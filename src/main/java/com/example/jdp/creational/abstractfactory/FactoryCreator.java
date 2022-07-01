package com.example.jdp.creational.abstractfactory;

public class FactoryCreator {
  public static AbstractFactory getFactory(String type) {
    if ("bank".equalsIgnoreCase(type)) {
      return new BankFactory();
    } else if ("credit".equalsIgnoreCase(type)) {
      return new CreditUnionFactory();
    }
    return null;
  }
}
