package com.example.prueballaves.repositorios;

import com.example.prueballaves.modelos.Beneficio;
import com.example.prueballaves.modelos.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepositorioBeneficio extends JpaRepository<Beneficio,Long> {

    @Query("SELECT b FROM Proveedor b WHERE b.poliza.id = :polizaId")
    List<Beneficio> findBeneficioByPolizaId(@Param("polizaId") Long polizaId);
}
