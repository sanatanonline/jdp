package com.example.jdp.creational.abstractfactory;

public class BankFactory extends AbstractFactory {

  @Override
  public Bank getBank(String name) {

    if ("chase".equalsIgnoreCase(name)) {
      return new ChaseBank();
    } else if ("wellsfargo".equalsIgnoreCase(name)) {
      return new WellsfargoBabk();
    }
    return null;
  }

  @Override
  public CreditUnion getCreditUnion(String name) {
    return null;
  }
}
