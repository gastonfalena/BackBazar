package com.spring.BackBazar.DTO;

import com.spring.BackBazar.Model.Cliente;
import com.spring.BackBazar.Model.Venta;
import com.spring.BackBazar.Model.DetalleVenta;

import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VentaCrearDTO {

    private LocalDate fecha_venta; // Fecha de la venta
    private double total;          // Total de la venta
    private Long cliente_id;       // ID del cliente
    private List<DetalleVenta> detallesVenta;

    public VentaCrearDTO(LocalDate fecha_venta,double total,Long cliente_id,List<DetalleVenta> detallesVenta) {

        this.fecha_venta=fecha_venta;
        this.total=total;
        this.cliente_id= cliente_id;
        this.detallesVenta=detallesVenta;
    }
}
