package com.matomaylla.java_coding_practice.service;

import java.util.concurrent.CompletableFuture;

public class AsyncService13 {

    // Método utilizando hilos tradicionales (mala práctica)
    public void runTaskWithThread() {
        new Thread(() -> {
            // Simulación de una tarea
            System.out.println("Tarea ejecutada con Thread.");
        }).start();
    }

    // Método utilizando CompletableFuture (buena práctica)
    public CompletableFuture<Void> runTaskWithCompletableFuture() {
        return CompletableFuture.runAsync(() -> {
            // Simulación de una tarea
            System.out.println("Tarea ejecutada con CompletableFuture.");
        });
    }
}
