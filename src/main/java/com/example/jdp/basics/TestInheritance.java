package com.example.jdp.basics;

public class TestInheritance {
  public static void main(String[] args) {
    Parent p1 = new Parent();
    System.out.println(p1.override("parent1"));
    Parent p2 = new Child();
    System.out.println(p2.override("parent2"));
    Child c1 = new Child();
    System.out.println(c1.override("child1"));
  }
}
