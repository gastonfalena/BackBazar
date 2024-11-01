package com.spring.BackBazar.Model;

import jakarta.persistence.*;

@Entity
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int cantidad;
    private double precioUnitario;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "venta_id")
    private Venta venta;
    public DetalleVenta(){}
    public DetalleVenta(Long id,int cantidad,double precioUnitario){
        this.id = id;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

}
