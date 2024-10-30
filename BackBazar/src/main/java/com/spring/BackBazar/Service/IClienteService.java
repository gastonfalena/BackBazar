package com.spring.BackBazar.Service;
import com.spring.BackBazar.Model.Cliente;

import java.util.List;
public interface IClienteService {

    public List<Cliente> getClientes();
    public void saveCliente(Cliente cli);
    public void deleteCliente(Long id);
    public Cliente findCliente(Long id);
    public void editCliente(Cliente cli);

}
