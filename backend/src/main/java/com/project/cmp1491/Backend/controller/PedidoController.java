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
//Anotacao para permitir requicisoes de dominios
public class PedidoController {

    //objeto  //variavel
    private PedidoService pedidoService;

    // o Autowired, indica um ponto aonde a injeção automática deve ser aplicada.
    @Autowired
    public void setPedidoService(PedidoService pedidoService)
    {
        this.pedidoService = pedidoService;
    }


    //Essa anotação é usada para mapear solicitações HTTP POST em métodos específicos de manipulador
    @PostMapping(value = "/salvar-pedido")
    //O Request Body, onde geralmente enviamos dados que queremos gravar no servidor
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
            //status 404
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getReason());
        }
    }

    //Essa anotação é usada para mapear solicitações HTTP GET em métodos manipuladores específicos (axios é um manipulador)
    @GetMapping(value = "/consultar-pedido/{id}")
    //O path é utilizado quando o valor da variável é passada diretamente na URL
    public Pedido pedido(@PathVariable Integer id){
        return pedidoService.consultar(id);
    }

    //Essa anotação é usada para mapear solicitações HTTP GET em métodos manipuladores específicos (axios é um manipulador)
    @GetMapping(value = "/listar-pedidos")
    public List<Pedido> listar(){

            //O list fornece uma coleção ordenada de objetos
            List<Pedido>lista = pedidoService.listar();

            return lista;
    }
   //Esta anotação é usada para mapear solicitações HTTP DELETE em métodos manipuladores
    @DeleteMapping(value = "/excluir-pedido/{id}")
    //O path é utilizado quando o valor da variável é passada diretamente na URL
    public void excluir(@PathVariable Integer id){
        //Vai exlcuir pelo id
        pedidoService.excluir(id);
    }

}
