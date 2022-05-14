package com.project.cmp1491.Backend.negocio;

import com.project.cmp1491.Backend.entidade.Pedido;

import java.util.List;

public interface PedidoService {
    //Metodo visiveis
    public Pedido incluir(Pedido pedido);
    //Metodo visivel  //O list fornece uma coleção ordenada de objetos
    public List<Pedido>listar();
    //Metodo visivel
    public Pedido consultar(Integer id);
    //...
    public void alterar(Pedido pedido);
    //...
    public void excluir(Integer id);
}
