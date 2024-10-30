package com.spring.BackBazar.Repository;


import com.spring.BackBazar.Model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaRepository  extends JpaRepository<Venta, Long> {
}


