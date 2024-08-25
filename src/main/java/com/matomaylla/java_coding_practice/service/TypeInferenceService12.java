package com.matomaylla.java_coding_practice.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeInferenceService12 {
    // Método utilizando la declaración explícita de tipos (mala práctica)
    public void explicitTypeDeclaration() {
        Map<String, List<Integer>> map = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<Integer> value = entry.getValue();
        }
    }

    // Método utilizando la inferencia de tipos con var (buena práctica) (Java 10+)
    public void typeInferenceWithVar() {
        var map = new HashMap<String, List<Integer>>();
        for (var entry : map.entrySet()) {
            var key = entry.getKey();
            var value = entry.getValue();
        }
    }
}
