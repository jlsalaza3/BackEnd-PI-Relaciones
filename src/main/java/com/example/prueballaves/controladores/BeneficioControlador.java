package com.example.prueballaves.controladores;

import com.example.prueballaves.modelos.Beneficio;
import com.example.prueballaves.servicios.BeneficioServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/beneficios")
public class BeneficioControlador {

    @Autowired
    BeneficioServicios beneficioServicio;

    @GetMapping("/{proveedorId}")
    public ResponseEntity<?> obtenerBenefico (@PathVariable Long polizaId) throws Exception {
        try {
            List<Beneficio> beneficios = beneficioServicio.obtenerBeneficiosPorPoliza(polizaId);
            return ResponseEntity.ok(beneficios);
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
