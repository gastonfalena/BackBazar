package com.spring.BackBazar.Repository;

import com.spring.BackBazar.Model.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {
}
