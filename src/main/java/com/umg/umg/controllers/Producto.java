package com.umg.umg.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import view_models.ListaProductos;

@RestController
@RequestMapping("producto")
public class Producto {

    @GetMapping("/inicio")
    public ListaProductos Inicio(@RequestParam String nombre,
                         String marca,
                         String descripcion,
                         Integer precio){
        ListaProductos listap = new ListaProductos();
        listap.setNombre(nombre);
        listap.setMarca(marca);
        listap.setDescripcion(descripcion);
        listap.setPrecio(precio);
        return listap;
    }
}
