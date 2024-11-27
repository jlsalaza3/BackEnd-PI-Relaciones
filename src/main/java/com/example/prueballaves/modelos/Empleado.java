package com.example.prueballaves.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Empleado {

    @Id
    private Long id;
    private String nombreEmpleado;
    private String tipoIdentificacion;
    private Integer numeroIdentificacion;
    private LocalDate fechaNacimiento;
    private String areaTrabajo;
    private Integer telefonoEmpleado;
    private String correoElectronico;
    private String direccionEmpleado;
    private String ciudad;
    private String departamento;
    private String pais;
    private String rol;


}
