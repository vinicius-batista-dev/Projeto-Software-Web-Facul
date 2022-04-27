package com.project.cmp1491.Backend.persistencia;

import com.project.cmp1491.Backend.entidade.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRespository extends CrudRepository<Pedido, Integer> {
}
