package com.example.Avatex_api.dao;

import com.example.Avatex_api.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoDao extends CrudRepository<Producto,Long> {

}