package com.example.jdp.basics;

public class Child extends Parent {
  @Override
  public String override(String param) {
    return param + "something";
  }
}
