package com.mueble.demo.service;

import com.mueble.demo.entity.Cliente;
import com.mueble.demo.repository.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteImpl implements ClienteSer{
    //aqui llmaremos al repositorio

    @Autowired //significa que esto notacion ayuda a mostra en la consola
    ClienteRepo clienteRepo;
    //luego usaremos el espacio para poner o insetar variables


    @Override
    public List<Cliente> ConsultarPersona() {
        //usaremos this.clienteRepo
        //luego el Lis<>
        return (List<Cliente>) this.clienteRepo.findAll();
    }

    @Override
    public Cliente CrearCliente(Cliente cliente) {
        //ponemos getter y setter
        //usamos la notacion cliente
        cliente.setEmail(cliente.getEmail());
        //llamares a la clase entity
        return this.clienteRepo.save(cliente);
    }

    @Override
    public Cliente ModificarCliente(Cliente cliente) {
        return this.clienteRepo.save(cliente);
    }

    @Override
    public Cliente BuscarCliente(Long id) {
        //la persona por id
        return this.clienteRepo.findById(id).get();
    }

    @Override
    public void EliminarCliente(Long id) {
        //cuando eliminamos no hay retorno
        //por lo cual se usa void  que notara a la eliminacion por id
        this.clienteRepo.deleteById(id);

    }
}
