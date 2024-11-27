package com.example.prueballaves.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Beneficio {

    @Id
    private Long id;
    private String descripcionBeneficio;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;

    @ManyToOne
    @JoinColumn(name = "id_proveedor",referencedColumnName = "id")
    @JsonBackReference
    private Proveedor proveedor;

}
