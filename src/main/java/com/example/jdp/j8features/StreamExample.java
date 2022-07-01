package com.example.jdp.j8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

  public static void main(String[] args) {
    List<String> fruits = Arrays.asList("Banana", "Apple", "Orange", "Watermelon");
    Optional<String> fruit = fruits.stream().findFirst();
    fruit.ifPresent(
        p -> {
          int i = 99;
          System.out.println(p + i);
        });
    fruit.ifPresent(
        new Consumer<String>() {
          @Override
          public void accept(String s) {
            System.out.println(s);
          }
        });
    fruit.ifPresent(System.out::println);
    System.out.println(fruits.stream().findFirst());

    fruits.stream().allMatch(s -> s.startsWith("W"));
    System.out.println(fruits.stream().anyMatch(s -> s.startsWith("W")));
    System.out.println(
        fruits.stream()
            .anyMatch(
                new Predicate<String>() {
                  @Override
                  public boolean test(String s) {
                    return s.startsWith("M");
                  }
                }));

    System.out.println("Count: " + fruits.stream().count());
    System.out.println(fruits.stream().distinct().collect(Collectors.toList()));
    System.out.println(fruits.stream().filter(s -> s.startsWith("W")).collect(Collectors.toList()));
    System.out.println(fruits.stream().map(s -> s + "appended").collect(Collectors.toList()));
    System.out.println(fruits.stream().sorted().collect(Collectors.toList()));
  }
}
