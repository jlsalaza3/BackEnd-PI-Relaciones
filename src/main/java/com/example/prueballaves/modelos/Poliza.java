package com.example.prueballaves.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Poliza {
    @Id
    private Long id;
    private String tipoPoliza;
    private String nombrePoliza;
    private String descripcionPoliza;
}
