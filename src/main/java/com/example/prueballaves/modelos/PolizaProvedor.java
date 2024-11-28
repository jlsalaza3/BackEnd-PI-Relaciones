/*package com.example.prueballaves.modelos;

import com.example.prueballaves.llave.PolizaProveedorLlave;
import jakarta.persistence.*;

@Entity
@IdClass(PolizaProveedorLlave.class)
public class PolizaProvedor {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_poliza", referencedColumnName = "id")
    private Poliza poliza;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id")
    private Proveedor proveedor;

    public PolizaProvedor() {
    }

    public PolizaProvedor(Poliza poliza, Proveedor proveedor) {
        this.poliza = poliza;
        this.proveedor = proveedor;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
*/