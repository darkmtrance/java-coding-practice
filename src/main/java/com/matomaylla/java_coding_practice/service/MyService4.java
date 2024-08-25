package com.matomaylla.java_coding_practice.service;

import com.matomaylla.java_coding_practice.repository.Repository4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService4 {
    // Mala práctica: Hardcoding la dependencia
    private Repository4 repositoryBadPractice = new Repository4();

    // Buena práctica: Inyección de dependencia a través del constructor
    private Repository4 repository;

    @Autowired
    public MyService4(Repository4 repository) {
        this.repository = repository;
    }

    public String getDataBadPractice() {
        return repositoryBadPractice.fetchData();
    }

    public String getDataGoodPractice() {
        return repository.fetchData();
    }
}
