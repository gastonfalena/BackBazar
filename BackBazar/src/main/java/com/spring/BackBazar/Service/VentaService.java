package com.spring.BackBazar.Service;

import com.spring.BackBazar.Model.Cliente;
import com.spring.BackBazar.Model.Producto;
import com.spring.BackBazar.Model.Venta;
import com.spring.BackBazar.Repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class VentaService implements IVentaService {

    @Autowired
    private IVentaRepository ventaRepository;

    @Override
    public List<Venta> getVentas() {
        return ventaRepository.findAll();
    }

    @Override
    public void saveVenta(Venta venta) {
        ventaRepository.save(venta);
    }

    @Override
    public void deleteVenta(Long id) {
        ventaRepository.deleteById(id);
    }

    @Override
    public Venta findVenta(Long id) {
        return ventaRepository.findById(id).orElse(null);
    }

    @Override
    public void editVenta(Venta venta) {
        this.saveVenta(venta);
    }
}