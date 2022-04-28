package com.project.cmp1491.Backend.controller;

import com.project.cmp1491.Backend.entidade.Pedido;
import com.project.cmp1491.Backend.negocio.PedidoService;
import com.project.cmp1491.Backend.util.PedidoBackendException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class PedidoController {

    private PedidoService pedidoService;

    @Autowired
    public void setPedidoService(PedidoService pedidoService)
    {
        this.pedidoService = pedidoService;
    }

    @PostMapping(value = "/salvar-usuario")
    public Pedido salvar(@RequestBody Pedido pedido)
    {
        try{
            if(pedido.getId() == null){
                pedido = pedidoService.incluir(pedido);
            }else{
                pedidoService.alterar(pedido);
            }
            return pedido;
        }catch (PedidoBackendException ex){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getReason());
        }
    }
}
