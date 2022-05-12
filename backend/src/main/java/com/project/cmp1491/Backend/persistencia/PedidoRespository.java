package com.project.cmp1491.Backend.persistencia;

import com.project.cmp1491.Backend.entidade.Pedido;
import org.springframework.data.repository.CrudRepository;

//Interface que extende todas as operacoes basicas do CRUD Spring Data
public interface PedidoRespository extends CrudRepository<Pedido, Integer> {
}
