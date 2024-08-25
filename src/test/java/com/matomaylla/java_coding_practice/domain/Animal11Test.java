package com.matomaylla.java_coding_practice.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Animal11Test {

    @Test
    public void testBadPractice() {
        AnimalBadPractice11 dog = new DogBadPractice11();
        dog.sound();
        ((DogBadPractice11) dog).eat();  // Casting necesario para acceder al método 'eat'
    }

    @Test
    public void testGoodPractice() {
        AnimalGoodPractice11 dog = new DogGoodPractice11();
        dog.sound();
        dog.eat();  // No se requiere casting porque 'eat' es un método predeterminado en la interfaz
    }

}
