package com.matomaylla.java_coding_practice.service;

import org.springframework.stereotype.Service;

@Service
public class HtmlService1 {

    // Mala práctica: concatenación de cadenas tradicionales
    public String generateHtmlBadPractice() {
        return "<html>\n" +
                "<body>\n" +
                "<p>Hello, World!</p>\n" +
                "</body>\n" +
                "</html>\n";
    }

    // Buena práctica: uso de text blocks (Java 13+)
    public String generateHtmlGoodPractice() {
        return """
               <html>
               <body>
               <p>Hello, World!</p>
               </body>
               </html>
               """;
    }
}
