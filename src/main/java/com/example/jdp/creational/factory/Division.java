package com.example.jdp.creational.factory;

public class Division implements Operation {
  @Override
  public double calculate(double number1, double number2) {
    return number1 / number2;
  }
}
