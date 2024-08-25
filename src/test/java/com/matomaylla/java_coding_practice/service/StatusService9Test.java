package com.matomaylla.java_coding_practice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StatusService9Test {
    /**
     * Method under test: {@link StatusService9#getStatusBadPractice(int)}
     */
    @Test
    void testGetStatusBadPractice() {
        assertEquals("Activo", (new StatusService9()).getStatusBadPractice(1));
        assertEquals("Inactivo", (new StatusService9()).getStatusBadPractice(2));
        assertEquals("Desconocido", (new StatusService9()).getStatusBadPractice(0));
    }

    /**
     * Method under test: {@link StatusService9#getStatusGoodPractice(StatusService9.Status)}
     */
    @Test
    void testGetStatusGoodPractice() {
        assertEquals("Activo", (new StatusService9()).getStatusGoodPractice(StatusService9.Status.ACTIVE));
        assertEquals("Inactivo", (new StatusService9()).getStatusGoodPractice(StatusService9.Status.INACTIVE));
    }
}

