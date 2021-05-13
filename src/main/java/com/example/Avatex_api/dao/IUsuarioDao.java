package com.example.Avatex_api.dao;

import com.example.Avatex_api.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao  extends CrudRepository<Usuario, Long> {
    public Usuario findByUsername(String username);
}