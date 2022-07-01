package com.example.jdp.j8features;

import java.util.Optional;

public class TestOptional {
  public static void main(String[] args) {
    Optional<String> op = Optional.ofNullable("val");
    op.ifPresent(s -> System.out.println(s));
    op.ifPresent(System.out::println);
    op.ifPresentOrElse(
        value -> System.out.println("Found: " + value), () -> System.out.println("Not found"));
  }
}
