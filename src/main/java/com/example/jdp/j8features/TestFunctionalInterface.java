package com.example.jdp.j8features;

public class TestFunctionalInterface {
  public static void main(String[] args) {
    SampleFunctionalInterface sampleFunctionalInterface =
        new SampleFunctionalInterface() {
          @Override
          public void readFile() {
            System.out.println("new read file is called");
          }
        };
    sampleFunctionalInterface.readFile();
    sampleFunctionalInterface.processData();
    SampleFunctionalInterface.save("data");
  }
}
