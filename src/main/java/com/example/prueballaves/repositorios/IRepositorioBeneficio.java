package com.example.prueballaves.repositorios;

import com.example.prueballaves.modelos.Beneficio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioBeneficio extends JpaRepository<Beneficio,Long> {

   /* @Query("SELECT b FROM Beneficio b WHERE b.proveedor.id = :proveedorId")
    List<Beneficio> findBeneficioByProveedorId(@Param("proveedorId") Long proveedorId); // esto era para buscar por id*/
}
