package com.spring.BackBazar.Service;

import com.spring.BackBazar.Model.Cliente;
import com.spring.BackBazar.Model.Producto;
import com.spring.BackBazar.Model.Venta;
import com.spring.BackBazar.Repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

public class VentaService implements IVentasService {
    @Autowired
    IVentaRepository ventaRepository;
    @Override
    public List<Venta> getVentas() {
        return List.of();
    }

    @Override
    public void saveVenta(Venta vent) {

    }

    @Override
    public void deleteVenta(Long id) {

    }

    @Override
    public Venta findVenta(Long id) {
        return null;
    }

    @Override
    public void editVenta(Venta vent) {

    }
}
