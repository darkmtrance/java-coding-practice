package com.matomaylla.java_coding_practice.service;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class FileService8Test {


    private final FileService8 fileService = new FileService8();
    /**
     * Method under test: {@link FileService8#readFileBadPractice(String)}
     */

    @Test
    void testReadFileBadPractice() throws IOException {
        // Mala práctica: Se espera una IOException cuando no se cierra adecuadamente el recurso
        assertDoesNotThrow(() -> fileService.readFileBadPractice("file.txt"));
    }

    /**
     * Method under test: {@link FileService8#readFileGoodPractice(String)}
     */
    @Test
    void testReadFileGoodPractice() throws IOException {
        // Buena práctica: Asegurando que no se lance ninguna excepción usando try-with-resources
        assertDoesNotThrow(() -> fileService.readFileGoodPractice("file.txt"));
    }
}

