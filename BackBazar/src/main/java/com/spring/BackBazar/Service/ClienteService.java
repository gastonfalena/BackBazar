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
    public List<Cliente> getPersonas() {
        return List.of();
    }

    @Override
    public void saveCliente(Cliente cli) {

    }

    @Override
    public void deleteCliente(Long id) {

    }

    @Override
    public Cliente findCliente(Long id) {
        return null;
    }

    @Override
    public void editCliente(Long idOriginal, Long idNueva, String nombreNuevo, String nuevoApellido, String dni) {

    }
}
