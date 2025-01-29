package com.spring.BackBazar.Controller;

import com.spring.BackBazar.DTO.VentaCrearDTO;
import com.spring.BackBazar.Model.Cliente;
import com.spring.BackBazar.Model.Venta;
import com.spring.BackBazar.Service.IClienteService;
import com.spring.BackBazar.Service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private IVentaService ventaService;
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/traer")
    public List<Venta> getVentas() {
        return ventaService.getVentas();
    }

    @PostMapping(value= "/crear",consumes = {"application/xml","application/json"})
    public String saveVenta(@RequestBody VentaCrearDTO ventaC) {

        Cliente cliente = clienteService.findCliente(ventaC.getId_cliente());
        // Crear la entidad Venta
        Venta venta = new Venta();
        venta.setFecha_venta(ventaC.getFecha_venta());
        venta.setTotal(ventaC.getTotal());
        venta.setCliente(cliente);
        venta.setDetallesVenta(ventaC.getDetallesVenta());
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