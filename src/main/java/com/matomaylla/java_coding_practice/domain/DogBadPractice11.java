package com.matomaylla.java_coding_practice.domain;

public class DogBadPractice11 implements AnimalBadPractice11 {

    @Override
    public void sound() {
        System.out.println("Bark");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }
}
