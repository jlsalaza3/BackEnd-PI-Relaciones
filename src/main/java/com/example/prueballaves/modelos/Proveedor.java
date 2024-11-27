package com.example.prueballaves.modelos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Proveedor {
    @Id
    private Long id;
    private String razonSocial;
    private String tipoIdentificacion;
    private Integer numeroIdentificacion;
    private String correoProveedor;
    private Integer telefonoProveedor;
    private String direccionProveedor;
    private String ciudadProveedor;
    private String departamentoProveedor;
    private String paisProveedor;

    @OneToMany(mappedBy = "proveedor")
    @JsonManagedReference
    private List<Beneficio> beneficios;

}
