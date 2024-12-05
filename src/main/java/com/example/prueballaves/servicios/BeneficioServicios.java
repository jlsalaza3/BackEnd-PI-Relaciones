package com.example.prueballaves.servicios;

import com.example.prueballaves.modelos.Beneficio;
import com.example.prueballaves.modelos.Proveedor;
import com.example.prueballaves.repositorios.IRepositorioBeneficio;
import com.example.prueballaves.repositorios.IRepositorioProveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficioServicios {

    @Autowired
    IRepositorioBeneficio iRepositorioBeneficio;

    public List<Beneficio> obtenerBeneficiosPorPoliza(Long polizaId){
        return iRepositorioBeneficio.findBeneficioByPolizaId(polizaId);
    }
}

