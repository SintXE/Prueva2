package com.mueble.demo.service;

import com.mueble.demo.entity.Almacen;
import com.mueble.demo.entity.Cliente;
import com.mueble.demo.repository.AlmacenRepo;
import com.mueble.demo.repository.ClienteRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlmacenImpl implements AlmacenSer{

    @Autowired
    AlmacenRepo almacenRepo;

    @Override
    public List<Almacen> ConsultarAlmacen() {
        return (List<Almacen>) this.almacenRepo.findAll();
    }


    @Override
    public Almacen CrearAlmacen(Almacen almacen) {
        return this.almacenRepo.save(almacen);
    }

    @Override
    public Almacen ModificarAlmacen(Almacen almacen) {
        return this.almacenRepo.save(almacen);
    }

    @Override
    public Almacen BuscarAlmacen(Long id) {
        //la persona por id
        return this.almacenRepo.findById(id).get();
    }

    @Override
    public void Eliminar(Long id) {
        //cuando eliminamos no hay retorno
        //por lo cual se usa void  que notara a la eliminacion por id
        this.almacenRepo.deleteById(id);

    }
}

