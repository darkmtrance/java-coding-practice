package com.matomaylla.java_coding_practice.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {LoggingService6.class})
@ExtendWith(SpringExtension.class)
class LoggingService6Test {
    @Autowired
    private LoggingService6 loggingService6;

    /**
     * Method under test: {@link LoggingService6#logBadPractice()}
     */
    @Test
    void testLogBadPractice() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        loggingService6.logBadPractice();
    }

    /**
     * Method under test: {@link LoggingService6#logGoodPractice()}
     */
    @Test
    void testLogGoodPractice() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        loggingService6.logGoodPractice();
    }
}

