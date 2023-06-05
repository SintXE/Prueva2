package com.mueble.demo.controller;

import com.mueble.demo.entity.Almacen;
import com.mueble.demo.entity.Cliente;
import com.mueble.demo.service.AlmacenSer;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/almacen")

public class AlmacenCont {
    AlmacenSer almacenSerImpl;

    @GetMapping
    @RequestMapping(value="ConsultarAlmacen",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarAlmacen(){
        List<Almacen> listAlmacen=this.almacenSerImpl.ConsultarAlmacen();
        return ResponseEntity.ok(listAlmacen);
    }


    @PostMapping
    @RequestMapping(value="CrearAlmacen",method = RequestMethod.POST)
    public ResponseEntity<?> CrearAlmacen(@RequestBody Almacen almacen){
        Almacen AlmacenCreada=this.almacenSerImpl.CrearAlmacen(almacen);
        return ResponseEntity.status(HttpStatus.CREATED).body(AlmacenCreada);
    }

    @PutMapping
    @RequestMapping(value="ModificarAlmacen",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarAlmacen(@RequestBody Almacen almacen){
        Almacen AlmacenModificada=this.almacenSerImpl.CrearAlmacen(almacen);
        return ResponseEntity.status(HttpStatus.CREATED).body(AlmacenModificada);
    }


    @GetMapping
    @RequestMapping(value="BuscarAlmacen/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> CrearAlmacen(@PathVariable Long id){
        Almacen almacen=this.almacenSerImpl.BuscarAlmacen(id);
        return ResponseEntity.ok(almacen);
    }
    @DeleteMapping
    @RequestMapping(value="Eliminar/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> Eliminar(@PathVariable Long id){
        this.almacenSerImpl.Eliminar(id);
        return ResponseEntity.ok().build();
    }


}


