package com.example.prueballaves.servicios;

import com.example.prueballaves.modelos.Beneficio;
import com.example.prueballaves.repositorios.IRepositorioBeneficio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeneficioServicios {

    @Autowired
    IRepositorioBeneficio iRepositorioBeneficio;
    /*
    public Beneficio prueba (Beneficio datos) throws Exception{
         return iRepositorioBeneficio.
    }*/
}

