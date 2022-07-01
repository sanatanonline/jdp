package com.example.jdp.j8features;

@FunctionalInterface
public interface SampleFunctionalInterface {
  public void readFile();

  default void processData() {
    System.out.println("Processing data");
  }

  static void save(String str) {
    System.out.println("Data saved " + str);
  }
}
