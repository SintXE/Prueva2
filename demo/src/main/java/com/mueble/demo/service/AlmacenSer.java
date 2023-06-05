package com.mueble.demo.service;

import com.mueble.demo.entity.Almacen;


import java.util.List;

public interface AlmacenSer {

    public List<Almacen> ConsultarAlmacen();
    public Almacen CrearAlmacen(Almacen almacen);
    public Almacen ModificarAlmacen(Almacen almacen);
    public Almacen BuscarAlmacen(Long id);
    public void Eliminar(Long id);
}
