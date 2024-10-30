package com.spring.BackBazar.Repository;


import com.spring.BackBazar.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository  extends JpaRepository<Producto, Long> {
}

