package com.example.Avatex_api.controller;

import com.example.Avatex_api.entity.Pieza;
import com.example.Avatex_api.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PiezaRestController {
    @Autowired
    private IProductoService productoService;

    //BORRAR
    @GetMapping("/productos")
    public List<Pieza> index() { return productoService.findPiezas();}


    //ADMIN - USER
    @GetMapping("/productos/{id}")
    public Pieza show(@PathVariable Long id) {
        return productoService.findPiezaByID(id);
    }

    //ADMIN - USER
    @GetMapping("/productos/piezas/{nombre}")
    public List<Pieza> findByName(@PathVariable String nombre) {
        return productoService.findPiezaByName(nombre);
    }

    //ADMIN
    @PostMapping("/productos")
    @ResponseStatus(HttpStatus.CREATED)
    public Pieza create(@RequestBody Pieza pieza){
        pieza.setFecha(new Date());
        return productoService.save(pieza);
    }

    //ADMIN
    @PutMapping("/productos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Pieza update(@RequestBody Pieza pieza, @PathVariable Long id){
        return productoService.save(pieza);
    }
}
