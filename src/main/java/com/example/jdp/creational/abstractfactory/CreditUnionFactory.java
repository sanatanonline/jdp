package com.example.jdp.creational.abstractfactory;

public class CreditUnionFactory extends AbstractFactory {
  @Override
  public Bank getBank(String name) {
    return null;
  }

  @Override
  public CreditUnion getCreditUnion(String name) {
    if ("kpcu".equalsIgnoreCase(name)) {
      return new KeypointCreditUnion();
    } else if ("simple".equalsIgnoreCase(name)) {
      return new SimpleCreditUnion();
    }
    return null;
  }
}
