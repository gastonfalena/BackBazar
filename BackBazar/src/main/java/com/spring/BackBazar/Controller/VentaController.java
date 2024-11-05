package com.spring.BackBazar.Controller;

import com.spring.BackBazar.Model.Venta;
import com.spring.BackBazar.Service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private IVentaService ventaService;

    @GetMapping("/traer")
    public List<Venta> getVentas() {
        return ventaService.getVentas();
    }

    @PostMapping("/crear")
    public String saveVenta(@RequestBody Venta venta) {
        ventaService.saveVenta(venta);
        return "La venta fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteVenta(@PathVariable Long id) {
        ventaService.deleteVenta(id);
        return "La venta fue eliminada correctamente";
    }

    @PutMapping("/editar")
    public Venta editVenta(@RequestBody Venta venta) {
        ventaService.editVenta(venta);
        return ventaService.findVenta(venta.getCodigo_venta());
    }

    @GetMapping("/buscar/{id}")
    public Venta findVenta(@PathVariable Long id) {
        return ventaService.findVenta(id);
    }
}