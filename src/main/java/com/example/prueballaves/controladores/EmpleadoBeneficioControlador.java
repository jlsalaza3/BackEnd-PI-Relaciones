package com.example.prueballaves.controladores;

import com.example.prueballaves.modelos.EmpleadoBeneficio;
import com.example.prueballaves.servicios.EmpleadoBeneficioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/empleadoBeneficio")
public class EmpleadoBeneficioControlador {

    @Autowired
    EmpleadoBeneficioServicio empleadoBeneficioServicio;

    @PostMapping
    public ResponseEntity<?> crearSolicitud (@RequestBody EmpleadoBeneficio datos) throws Exception{
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(empleadoBeneficioServicio.guardarSolicitudes(datos));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
