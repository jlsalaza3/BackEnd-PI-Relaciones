package com.example.prueballaves.servicios;

import com.example.prueballaves.modelos.EmpleadoBeneficio;
import com.example.prueballaves.repositorios.IRepositorioEmpleadoBeneficio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoBeneficioServicio {

    @Autowired
    IRepositorioEmpleadoBeneficio iRepositorioEmpleadoBeneficio;

    public EmpleadoBeneficio guardarSolicitudes (EmpleadoBeneficio datos){
        return iRepositorioEmpleadoBeneficio.save(datos);
    }
}
