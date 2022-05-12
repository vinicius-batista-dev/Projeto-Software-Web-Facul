package com.project.cmp1491.Backend.negocio;

import com.project.cmp1491.Backend.entidade.Pedido;

import java.util.List;

public interface PedidoService {
    //Metodo visiveis ao controle com as operacoes de negocio
    public Pedido incluir(Pedido pedido);
    //Metodo visivel ao controle com as operacoes de negocio
    public List<Pedido>listar();
    //Metodo visivel ao controlle com as operacoes de negocio
    public Pedido consultar(Integer id);
    //...
    public void alterar(Pedido pedido);
    //...
    public void excluir(Integer id);
}
