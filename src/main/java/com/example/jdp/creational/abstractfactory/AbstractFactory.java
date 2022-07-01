package com.example.jdp.creational.abstractfactory;

public abstract class AbstractFactory {
  public abstract Bank getBank(String name);

  public abstract CreditUnion getCreditUnion(String name);
}
