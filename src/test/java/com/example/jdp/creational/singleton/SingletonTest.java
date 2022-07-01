package com.example.jdp.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

  @Test
  public void testSingleton() {

    Singleton obj1 = Singleton.getSingleton();
    Singleton obj2 = Singleton.getSingleton();

    assertThat(obj1).isNotNull();
    assertThat(obj2).isNotNull();
    assertThat(obj1).isEqualTo(obj2);
    assertThat(obj1.toString()).isEqualTo(obj2.toString());
    assertThat(obj1.hashCode()).isEqualTo(obj2.hashCode());
  }
}
