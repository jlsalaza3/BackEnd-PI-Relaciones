package com.example.prueballaves.controladores;

import com.example.prueballaves.modelos.Beneficio;
import com.example.prueballaves.servicios.BeneficioServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/beneficios")
public class BeneficioControlador {

    @Autowired
    BeneficioServicios beneficioServicio;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Beneficio datos){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(beneficioServicio.registrarBeneficio(datos));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> obtenerBenefico () throws Exception {
        try {
            List<Beneficio> beneficios = beneficioServicio.obtenerBeneficioPorProveedor();
            return ResponseEntity.ok(beneficios);
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
