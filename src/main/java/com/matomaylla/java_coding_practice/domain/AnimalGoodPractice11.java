package com.matomaylla.java_coding_practice.domain;

// template method
public interface AnimalGoodPractice11 {
    void sound();

    default void eat() {
        System.out.println("Animal is eating");
    }
}
