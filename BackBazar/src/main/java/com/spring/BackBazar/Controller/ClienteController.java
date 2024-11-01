package com.spring.BackBazar.Controller;


import com.spring.BackBazar.Model.Cliente;
import com.spring.BackBazar.Service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/{id}")
    public Cliente getCliente(@PathVariable Long id){
        return clienteService.findCliente(id);
    }
    @GetMapping("/all")
    public List<Cliente> getAllCliente(){
        return clienteService.getClientes();
    }
    @PostMapping("/crear")
    public String saveCliente(@RequestBody Cliente cli){
        clienteService.saveCliente(cli);
        return "El cliente fue registrado con exito";
    }
    @DeleteMapping("/borrar/{id}")
    public String deleteCliente(@PathVariable Long id){
        clienteService.deleteCliente(id);
        return "La persona fue eliminada correctamente";
    }
    @PutMapping("/editar")
    public Cliente editCliente(@RequestBody Cliente cli){
        clienteService.editCliente(cli);
        return clienteService.findCliente(cli.getId_cliente());
    }
}
