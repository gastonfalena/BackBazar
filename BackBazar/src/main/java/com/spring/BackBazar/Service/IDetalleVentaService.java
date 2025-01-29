package com.spring.BackBazar.Service;

import com.spring.BackBazar.Model.DetalleVenta;

import java.util.List;

public interface IDetalleVentaService {
    List<DetalleVenta> getDetallesVenta();
    void saveDetalleVenta(DetalleVenta detalleVenta);
    void deleteDetalleVenta(Long id);
}