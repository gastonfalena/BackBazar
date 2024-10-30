package com.spring.BackBazar.Service;

import com.spring.BackBazar.Model.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> getProductos();
    public void saveProducto(Producto prod);
    public void deleteeProducto(Long id);
    public Producto findProducto(Long id);
    public void editProducto(Producto prod);

}

