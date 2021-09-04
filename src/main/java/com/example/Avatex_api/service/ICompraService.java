package com.example.Avatex_api.service;


import com.example.Avatex_api.entity.Compra;

import java.util.Date;
import java.util.List;

public interface ICompraService {

    public List<Compra> findCompras();
    public Compra findCompraByID(Long id);
    public Compra findCompraByMonth(String mes);
    public Compra save(Compra compra);
    public Compra cancel(Long id);
}
