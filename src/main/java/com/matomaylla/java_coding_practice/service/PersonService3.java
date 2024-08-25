package com.matomaylla.java_coding_practice.service;

import org.springframework.stereotype.Service;

@Service
public class PersonService3 {

    // Mala práctica: Uso de clases tradicionales para datos inmutables
    public String getPersonDetailsBadPractice() {
        Person person = new Person("John Doe", 30);
        return "Name: " + person.getName() + ", Age: " + person.getAge();
    }

    // Buena práctica: Uso de records para datos inmutables (Java 14+)
    public String getPersonDetailsGoodPractice() {
        PersonRecord personRecord = new PersonRecord("Jane Doe", 25);
        return "Name: " + personRecord.name() + ", Age: " + personRecord.age();
    }

    // Clase tradicional para datos inmutables
    static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    // Record para datos inmutables (Java 14+)
    public record PersonRecord(String name, int age) {}
}
