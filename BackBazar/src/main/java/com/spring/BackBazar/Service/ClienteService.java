package com.spring.BackBazar.Service;

import com.spring.BackBazar.Model.Cliente;
import com.spring.BackBazar.Repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteRepository clienteRepository;

    @Override
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public void saveCliente(Cliente cli) {
        clienteRepository.save(cli);
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Cliente findCliente(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public void editCliente(Cliente cli) {
        this.saveCliente(cli);
    }
}
