package com.matomaylla.java_coding_practice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.matomaylla.java_coding_practice.repository.Repository4;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {MyService4.class})
@ExtendWith(SpringExtension.class)
class MyService4Test {
    @Autowired
    private MyService4 myService4;

    @MockBean
    private Repository4 repository4;

    /**
     * Method under test: {@link MyService4#getDataBadPractice()}
     */
    @Test
    void testGetDataBadPractice() {
        assertEquals("Data from repository", myService4.getDataBadPractice());
    }

    /**
     * Method under test: {@link MyService4#getDataGoodPractice()}
     */
    @Test
    void testGetDataGoodPractice() {
        when(repository4.fetchData()).thenReturn("Fetch Data");
        assertEquals("Fetch Data", myService4.getDataGoodPractice());
        verify(repository4).fetchData();
    }
}

