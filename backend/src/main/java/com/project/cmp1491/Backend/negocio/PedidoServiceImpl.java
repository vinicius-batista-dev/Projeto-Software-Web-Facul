package com.project.cmp1491.Backend.negocio;

import com.project.cmp1491.Backend.entidade.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import com.project.cmp1491.Backend.persistencia.PedidoRespository;

@Component
@Transactional
public class PedidoServiceImpl implements PedidoService{

    private final PedidoRespository repository;

    @Autowired
    public PedidoServiceImpl(PedidoRespository repository) {
        this.repository = repository;
    }

    @Override
    public Pedido incluir(Pedido pedido) {
        try{

        }catch (Exception err){

        }
        return null;
    }

    @Override
    public List<Pedido> listar() {
        try{

        }catch (Exception err){

        }
        return null;
    }

    @Override
    public Pedido consultar(Integer id) {
        try{

        }catch (Exception err){

        }
        return null;
    }

    @Override
    public void alterar(Pedido pedido) {
        try{

        }catch (Exception err){

        }
    }

    @Override
    public void excluir(Integer id) {
        try {

        }catch (Exception err){

        }
    }
}
