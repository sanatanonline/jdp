package com.example.jdp.j8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestLambda {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);

    numbers.forEach(
        new Consumer<Integer>() {
          @Override
          public void accept(Integer integer) {
            System.out.println(integer);
          }
        });

    numbers.forEach(integer -> System.out.println(integer));

    numbers.forEach(System.out::println);
  }
}
