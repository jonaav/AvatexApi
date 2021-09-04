package com.example.Avatex_api.service;

import com.example.Avatex_api.dao.IComprasDao;
import com.example.Avatex_api.dao.IPiezaDao;
import com.example.Avatex_api.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CompraService implements ICompraService{

    @Autowired
    private IPiezaDao piezaDao;
    @Autowired
    private IComprasDao compraDao;


    @Override
    public List<Compra> findCompras() {
        return (List<Compra>) compraDao.findAll();
    }

    @Override
    public Compra findCompraByID(Long id) {
        return compraDao.findById(id).orElse(null);
    }

    @Override
    public Compra findCompraByMonth(String mes) {
        return null;
    }

    @Override
    public Compra save(Compra compra) {
        return compraDao.save(compra);
    }

    @Override
    public Compra cancel(Long id) {
        Compra compra = new Compra();
        compra = compraDao.findById(id).orElse(null);
        return compraDao.save(compra);
    }
}
