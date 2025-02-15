package com.spring.BackBazar.Repository;


import com.spring.BackBazar.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoRepository  extends JpaRepository<Producto, Long> {
    @Query("SELECT p FROM Producto p WHERE p.cantidad_disponible < :cantidad")
    List<Producto> obtenerProductosConStockMenor(int cantidad);
}

