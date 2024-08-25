package com.matomaylla.java_coding_practice.service;

import org.springframework.stereotype.Service;

@Service
public class InstanceOfService2 {
    // Mala práctica: casting tradicional después de `instanceof`
    public int getStringLengthBadPractice(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            return str.length();
        }
        return -1; // Valor de retorno si no es una instancia de String
    }

    // Buena práctica: uso de pattern matching para `instanceof` (Java 16+)
    public int getStringLengthGoodPractice(Object obj) {
        if (obj instanceof String str) {
            return str.length();
        }
        return -1; // Valor de retorno si no es una instancia de String
    }
}
