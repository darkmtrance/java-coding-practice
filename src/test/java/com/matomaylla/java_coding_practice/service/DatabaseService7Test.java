package com.matomaylla.java_coding_practice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.matomaylla.java_coding_practice.config.LoadPropertiesConfig7;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ContextConfiguration(classes = {DatabaseService7.class, LoadPropertiesConfig7.class})
@EnableConfigurationProperties(value = LoadPropertiesConfig7.class)
@TestPropertySource("classpath:application.properties")
class DatabaseService7Test {
    @Autowired
    private DatabaseService7 databaseService7;

    /**
     * Method under test: {@link DatabaseService7#getDbUrlBadPractice()}
     */
    @Test
    void testGetDbUrlBadPractice() {
        assertEquals("jdbc:mysql://localhost:3306/mydb", (new DatabaseService7()).getDbUrlBadPractice());
    }

    /**
     * Method under test: {@link DatabaseService7#getDbUrlGoodPractice()}
     */
    @Test
    void testGetDbUrlGoodPractice() {
        assertEquals("jdbc:mysql://localhost:3306/mydb",databaseService7.getDbUrlGoodPractice());
    }
}

