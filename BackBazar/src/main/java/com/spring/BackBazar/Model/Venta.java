package com.spring.BackBazar.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo_venta;
    private LocalDate fecha_venta;
    private double total;
    private List<Producto> listaProductos;
    private Cliente unCliente;
}
