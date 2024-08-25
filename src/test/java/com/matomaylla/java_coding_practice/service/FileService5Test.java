package com.matomaylla.java_coding_practice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {FileService5.class})
@ExtendWith(SpringExtension.class)
class FileService5Test {
    @Autowired
    private FileService5 fileService5;

    /**
     * Method under test: {@link FileService5#readFileBadPractice(String)}
     */
    @Test
    void testReadFileBadPractice() {
        assertEquals("An error occurred", fileService5.readFileBadPractice("/directory/foo.txt"));
    }

    /**
     * Method under test: {@link FileService5#readFileGoodPractice(String)}
     */
    @Test
    void testReadFileGoodPractice() {
        assertEquals("File not found", fileService5.readFileGoodPractice("/directory/foo.txt"));
    }
}

