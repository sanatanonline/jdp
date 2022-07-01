package com.example.jdp.creational.singleton;

public class Singleton {

  private static Singleton singleton;

  private Singleton() {}

  public static synchronized Singleton getSingleton() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
}
