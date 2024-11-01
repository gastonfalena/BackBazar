package com.spring.BackBazar.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;
    private String nombre;
    private String apellido;
    private String dni;
    @OneToMany(mappedBy="cliente",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Venta> ventas = new ArrayList<>();
    public Cliente () {
    }

    public  Cliente (Long id_cliente,String nombre, String apellido,String dni) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
}
