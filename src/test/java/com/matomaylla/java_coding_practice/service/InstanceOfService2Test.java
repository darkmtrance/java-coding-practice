package com.matomaylla.java_coding_practice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {InstanceOfService2.class})
@ExtendWith(SpringExtension.class)
class InstanceOfService2Test {
    @Autowired
    private InstanceOfService2 instanceOfService2;

    /**
     * Method under test: {@link InstanceOfService2#getStringLengthBadPractice(Object)}
     */
    @Test
    void testGetStringLengthBadPractice() {
        assertEquals(3, instanceOfService2.getStringLengthBadPractice("Obj"));
        assertEquals(-1, instanceOfService2.getStringLengthBadPractice(1));
    }

    /**
     * Method under test: {@link InstanceOfService2#getStringLengthGoodPractice(Object)}
     */
    @Test
    void testGetStringLengthGoodPractice() {
        assertEquals(3, instanceOfService2.getStringLengthGoodPractice("Obj"));
        assertEquals(-1, instanceOfService2.getStringLengthGoodPractice(1));
    }
}

