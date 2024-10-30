package com.spring.BackBazar.Service;


import com.spring.BackBazar.Model.Venta;

import java.util.List;

public interface IVentasService {
    public List<Venta> getVentas();
    public void saveVenta(Venta vent);
    public void deleteVenta(Long id);
    public Venta findVenta(Long id);
    public void editVenta(Venta vent);
}