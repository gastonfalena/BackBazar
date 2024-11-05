package com.spring.BackBazar.Controller;

import com.spring.BackBazar.Model.Cliente;
import com.spring.BackBazar.Model.Producto;
import com.spring.BackBazar.Service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private IProductoService productoService;

    @GetMapping("/all")
    public List<Producto> getProductos(){
        return productoService.getProductos();
    }
    @GetMapping("/{id}")
    public Producto getProducto(@PathVariable Long id){
        return productoService.findProducto(id);
    }
    @PostMapping("/crear")
    public String saveProducto(@RequestBody Producto prod){
        productoService.saveProducto(prod);
        return "El producto fue creado correctamente";
    }
    @DeleteMapping("borrar/{id}")
    public String deleteProducto(@PathVariable Long id){
        productoService.deleteeProducto(id);
        return "El producto fue elimiando correctamente";
    }
    @PutMapping("/editar")
    public Producto editProducto(@RequestBody Producto prod){
        productoService.editProducto(prod);
        return productoService.findProducto(prod.getCodigo_producto());
    }
}
