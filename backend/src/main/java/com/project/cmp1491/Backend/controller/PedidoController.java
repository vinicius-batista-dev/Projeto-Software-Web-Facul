package com.project.cmp1491.Backend.controller;



import com.project.cmp1491.Backend.negocio.PedidoServiceImpl;
import com.project.cmp1491.Backend.util.PedidoBackendException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.project.cmp1491.Backend.entidade.Pedido;
import com.project.cmp1491.Backend.negocio.PedidoService;

import java.util.List;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
//Anotacoes para permitir requicisoes de dominios cruzados
//O que sao esses Dominios Cruzados
public class PedidoController {

    private PedidoService pedidoService;

    @Autowired
    public void setPedidoService(PedidoService pedidoService)
    {
        this.pedidoService = pedidoService;
    }

    @PostMapping(value = "/salvar-pedido")
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

    @GetMapping(value = "/consultar-pedido/{id}")
    public Pedido pedido(@PathVariable Integer id){
        return pedidoService.consultar(id);
    }

    @GetMapping(value = "/listar-pedidos")
    public List<Pedido> listar(){

            List<Pedido>lista = pedidoService.listar();

            return lista;
    }

    @DeleteMapping(value = "/deletar-pedido/{id}")
    public void excluir(@PathVariable Integer id){
        //Vai exlcuir pelo id
        pedidoService.excluir(id);
    }

}
