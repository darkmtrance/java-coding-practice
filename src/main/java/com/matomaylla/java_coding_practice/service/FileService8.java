package com.matomaylla.java_coding_practice.service;

import java.io.FileInputStream;
import java.io.IOException;
public class FileService8 {

    // Mala práctica: No cerrar adecuadamente los recursos
    public void readFileBadPractice(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        try {
            int data = fis.read();
        } finally {
            // Simulación de la omisión del método close()
            // No se cierra el FileInputStream
        }
    }

    // Buena práctica: Usar try-with-resources para asegurar que los recursos se cierren
    public void readFileGoodPractice(String fileName) throws IOException {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int data = fis.read();
        }
    }
}
