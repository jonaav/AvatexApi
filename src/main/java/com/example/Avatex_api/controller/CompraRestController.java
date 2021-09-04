package com.example.Avatex_api.controller;

import com.example.Avatex_api.entity.Compra;
import com.example.Avatex_api.service.ICompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class CompraRestController {

    @Autowired
    private ICompraService compraService;

    @GetMapping("/compras")
    public List<Compra> findAll(){
        return compraService.findCompras();
    }

    @GetMapping("/compras/:id")
    public Compra findById(Long id){
        return compraService.findCompraByID(id);
    }

    @PostMapping("/compras")
    public Compra create(Compra compra){
        return  compraService.save(compra);
    }

    @PutMapping("/compras/:id")
    public Compra cancel(Long id){
        return compraService.cancel(id);
    }




}
