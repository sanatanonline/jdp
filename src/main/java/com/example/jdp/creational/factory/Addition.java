package com.example.jdp.creational.factory;

public class Addition implements Operation {
  @Override
  public double calculate(double number1, double number2) {
    return number1 + number2;
  }
}
