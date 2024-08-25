package com.matomaylla.java_coding_practice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {HtmlService1.class})
@ExtendWith(SpringExtension.class)
class HtmlService1Test {
    @Autowired
    private HtmlService1 htmlService1;

    private final String expectedHtml = "<html>\n<body>\n<p>Hello, World!</p>\n</body>\n</html>\n";

    /**
     * Method under test: {@link HtmlService1#generateHtmlBadPractice()}
     */
    @Test
    void testGenerateHtmlBadPractice() {
        assertEquals(expectedHtml, htmlService1.generateHtmlBadPractice());
    }

    /**
     * Method under test: {@link HtmlService1#generateHtmlGoodPractice()}
     */
    @Test
    void testGenerateHtmlGoodPractice() {
        assertEquals(expectedHtml, htmlService1.generateHtmlGoodPractice());
    }
}

