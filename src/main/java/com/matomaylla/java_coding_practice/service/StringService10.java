package com.matomaylla.java_coding_practice.service;

import java.util.List;

public class StringService10 {

    // Mala práctica: Usar expresiones lambda cuando se puede usar referencias a métodos
    public void printStringsBadPractice(List<String> list) {
        list.forEach(s -> System.out.println(s));
    }

    // Buena práctica: Usar referencias a métodos para un código más limpio
    public void printStringsGoodPractice(List<String> list) {
        list.forEach(System.out::println);
    }
}
