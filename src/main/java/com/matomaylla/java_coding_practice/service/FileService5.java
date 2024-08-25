package com.matomaylla.java_coding_practice.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Service
public class FileService5 {
    // Mala práctica: Uso de excepciones genéricas
    public String readFileBadPractice(String filePath) {
        try {
            Scanner scanner = new Scanner(new File(filePath));
            return scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace(); // Imprime la traza de la pila sin información útil para el usuario
            return "An error occurred";
        }
    }

    // Buena práctica: Uso de excepciones específicas
    public String readFileGoodPractice(String filePath) {
        try {
            Scanner scanner = new Scanner(new File(filePath));
            return scanner.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage()); // Mensaje específico para el usuario
            return "File not found";
        }
    }
}
