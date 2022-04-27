package com.project.cmp1491.Backend.negocio;

import com.project.cmp1491.Backend.entidade.Pedido;

import java.util.List;

public interface PedidoService {
    public Pedido incluir(Pedido pedido);
    public List<Pedido>listar();
    public Pedido consultar(Integer id);
    public void alterar(Pedido pedido);
}
