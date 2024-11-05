package com.spring.BackBazar.Service;

import com.spring.BackBazar.Model.Producto;
import com.spring.BackBazar.Repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductoService implements IProductoService {
    @Autowired
    IProductoRepository productoRepository;
    @Override
    public List<Producto> getProductos() {
        return productoRepository.findAll();
    }

    @Override
    public void saveProducto(Producto prod) {
        productoRepository.save(prod);
    }

    @Override
    public void deleteeProducto(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Producto findProducto(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public void editProducto(Producto prod) {
        this.saveProducto(prod);
    }
}
