package com.matomaylla.java_coding_practice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggingService6 {

    // Mala práctica: Uso de System.out.println para logging
    public void logBadPractice() {
        System.out.println("This is a logging message using System.out.println");
    }

    // Buena práctica: Uso de un marco de logging como SLF4J
    private static final Logger logger = LoggerFactory.getLogger(LoggingService6.class);

    public void logGoodPractice() {
        logger.debug("This is a debug message using SLF4J Logger");
        logger.info("This is an info message using SLF4J Logger");
        logger.error("This is an error message using SLF4J Logger");
    }
}
