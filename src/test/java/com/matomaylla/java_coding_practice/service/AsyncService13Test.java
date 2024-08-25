package com.matomaylla.java_coding_practice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.Test;

class AsyncService13Test {
    /**
     * Method under test: {@link AsyncService13#runTaskWithThread()}
     */
    @Test
    void testRunTaskWithThread() {
        // Crear instancia del servicio
        AsyncService13 service = new AsyncService13();
        // Ejecutar el método que utiliza hilos tradicionales
        service.runTaskWithThread();

        // Agregar una pausa para permitir que la tarea asíncrona termine (no recomendado en producción)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method under test: {@link AsyncService13#runTaskWithCompletableFuture()}
     */
    @Test
    void testRunTaskWithCompletableFuture() throws ExecutionException, InterruptedException {
        // Crear instancia del servicio
        AsyncService13 service = new AsyncService13();
        // Ejecutar el método que utiliza CompletableFuture
        CompletableFuture<Void> future = service.runTaskWithCompletableFuture();

        // Esperar a que la tarea CompletableFuture termine
        future.get();
    }
}

