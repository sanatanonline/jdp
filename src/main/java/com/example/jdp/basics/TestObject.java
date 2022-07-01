package com.example.jdp.basics;

public class TestObject {
  public static void main(String[] args) {
    Employee e1 = new Employee(1, "password123", "John Doe");
    Employee e2 = new Employee(1, "password123", "John Doe");

    System.out.println(e1 == e2);
    System.out.println(e1.equals(e2));

    System.out.println(e1.hashCode());
    System.out.println(e2.hashCode());

    String str1 = "Java";
    String str2 = "Java";
    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));
    System.out.println(str1.hashCode());
    System.out.println(str2.hashCode());
  }

  private String overload(String param) {
    return null;
  }

  private String overload(String param1, String param2) {
    return null;
  }
}
