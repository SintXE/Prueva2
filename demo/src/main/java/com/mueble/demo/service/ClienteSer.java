package com.mueble.demo.service;

import com.mueble.demo.entity.Cliente;
import com.mueble.demo.repository.ClienteRepo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClienteSer {
    //creamos las funciones que realizara nuestro CRUD

    public List<Cliente> ConsultarPersona();
    public Cliente CrearCliente(Cliente cliente);
    public Cliente ModificarCliente(Cliente cliente);
    public Cliente BuscarCliente(Long id);
    public void EliminarCliente(Long id);


}