package com.matomaylla.java_coding_practice.service;

public class StatusService9 {

    public static final int STATUS_ACTIVE = 1;
    public static final int STATUS_INACTIVE = 2;

    // Método que usa constantes enteras
    public String getStatusBadPractice(int status) {
        if (status == STATUS_ACTIVE) {
            return "Activo";
        } else if (status == STATUS_INACTIVE) {
            return "Inactivo";
        } else {
            return "Desconocido";
        }
    }

    // Buena práctica: Usar enum para representar estados
    public enum Status {
        ACTIVE, INACTIVE
    }

    // Método que usa enum
    public String getStatusGoodPractice(Status status) {
        switch (status) {
            case ACTIVE:
                return "Activo";
            case INACTIVE:
                return "Inactivo";
            default:
                return "Desconocido";
        }
    }
}
