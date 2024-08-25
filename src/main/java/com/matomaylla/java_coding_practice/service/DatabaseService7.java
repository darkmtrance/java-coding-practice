package com.matomaylla.java_coding_practice.service;

import com.matomaylla.java_coding_practice.config.LoadPropertiesConfig7;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService7 {
    @Autowired
    private LoadPropertiesConfig7 loadPropertiesConfig7;


    // Mala práctica: Valor de configuración codificado directamente en el código
    public String getDbUrlBadPractice() {
        String dbUrl = "jdbc:mysql://localhost:3306/mydb";
        return dbUrl;
    }



    // Buena práctica: Usar configuración de Spring Boot

    public String getDbUrlGoodPractice() {
        return loadPropertiesConfig7.getUrl();
    }
}
