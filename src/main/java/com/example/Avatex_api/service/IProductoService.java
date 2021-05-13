package com.example.Avatex_api.service;

import com.example.Avatex_api.entity.Pieza;
import com.example.Avatex_api.entity.Producto;

import java.util.List;

public interface IProductoService {

    public List<Pieza> findPiezas();
    public Pieza findPiezaByID(Long id);
    public List<Pieza> findPiezaByName(String nombre);
    public Pieza save(Pieza pieza);
}