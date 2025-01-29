package com.spring.BackBazar.Service;

import com.spring.BackBazar.Model.DetalleVenta;
import com.spring.BackBazar.Model.Venta;
import com.spring.BackBazar.Repository.IDetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleVentaService implements IDetalleVentaService {

    @Autowired
    private IDetalleVentaRepository detalleVentaRepository;

    @Override
    public List<DetalleVenta> getDetallesVenta() {
        return detalleVentaRepository.findAll();
    }

    @Override
    public void saveDetalleVenta(DetalleVenta detalleVenta) {
        detalleVentaRepository.save(detalleVenta);
    }

    @Override
    public void deleteDetalleVenta(Long id) {
        detalleVentaRepository.deleteById(id);
    }
//    public Venta getVenta(){
//
//    }
}
