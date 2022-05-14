package com.project.cmp1491.Backend.negocio;

import com.project.cmp1491.Backend.BackendApplication;
import com.project.cmp1491.Backend.entidade.Pedido;
import com.project.cmp1491.Backend.util.PedidoBackendException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;
import java.util.List;
import com.project.cmp1491.Backend.persistencia.PedidoRespository;

@Component
//ele será responsável por um Bean que representa uma entidade
@Transactional
//Faz o controle de transacao em cada metodo
public class PedidoServiceImpl implements PedidoService{

    private final PedidoRespository repository;

   //Faz a injecao de dependencia do objeto de persistencia na classe de negocio
    @Autowired
    public PedidoServiceImpl(PedidoRespository repository) {
        this.repository = repository;
    }

    @Override
    //Ele é uma forma de garantir que você está sobrescrevendo um método
    public Pedido incluir(Pedido pedido) {
        try{
            repository.save(pedido);
            //Metodo de salvar

            return pedido;
        }catch (Exception err){
            throw new PedidoBackendException("Nao foi possivel incluir");
            //Vai retornar um error quando nao for incluido
        }
    }

    //Ele é uma forma de garantir que você está sobrescrevendo um método
    @Override
    //Metodo listar que lista todos clientes
    public List<Pedido> listar() {
        try{
            // O list é uma biblioteca que mapea a entidade Cliente
            return (List<Pedido>)this.repository.findAll();
        }catch (Exception err){
            throw new PedidoBackendException("Nao foi possivel listar");
        }
    }

    //Ele é uma forma de garantir que você está sobrescrevendo um método
    @Override
    //Metodo para realizar uma consulta de todos os clientes
    public Pedido consultar(Integer id) {
        try{
            return this.repository.findById(id).get();
        }catch(Exception err){
            throw new PedidoBackendException("Nao foi possivel consultar");
        }
    }

    //Ele é uma forma de garantir que você está sobrescrevendo um método
    @Override
    //Metodo para alterar o pedido
    public void alterar(Pedido pedido) {
        try{
            repository.save(pedido);
        }catch (Exception err){
            throw new PedidoBackendException("Nao foi possivel alterar");
        }
    }
    //Ele é uma forma de garantir que você está sobrescrevendo um método
    @Override
    //Metodo para excluir o pedido
    public void excluir(Integer id) {
            try{
                repository.deleteById(id);
            }catch (Exception err){
                throw new PedidoBackendException("Nao foi possivel excluir" + id + "!");
            }
      }
}
