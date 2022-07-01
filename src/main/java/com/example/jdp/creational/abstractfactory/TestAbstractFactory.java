package com.example.jdp.creational.abstractfactory;

public class TestAbstractFactory {
  public static void main(String[] args) {
    String bankName = FactoryCreator.getFactory("bank").getBank("chase").getBankName();
    System.out.println(bankName);
  }
}
