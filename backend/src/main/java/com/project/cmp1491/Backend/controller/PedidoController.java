package com.project.cmp1491.Backend.controller;

import com.project.cmp1491.Backend.negocio.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class PedidoController {

    private PedidoService pedidoService;

    @Autowired
    public void setPedidoService(PedidoService pedidoService)
    {
        this.pedidoService = pedidoService;
    }
}
