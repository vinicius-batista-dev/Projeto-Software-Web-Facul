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
//Componente gerenciado pelo Spring
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
    public Pedido incluir(Pedido pedido) {
        try{
            repository.save(pedido);
            //Metodo da persistencia que salva o pedido no banco de dados
            //E vai retornar o pedido
            return pedido;
        }catch (Exception err){
            throw new PedidoBackendException("Nao foi possivel incluir");
            //Vai retornar um error quando nao for incluido
        }
    }

    @Override
    //Metodo listar que lista todos usuarios
    public List<Pedido> listar() {
        try{
            // O list é uma biblioteca que mapea a entidade Pedido
            return (List<Pedido>)this.repository.findAll();
        }catch (Exception err){
            throw new PedidoBackendException("Nao foi possivel listar");
        }
    }

    @Override
    public Pedido consultar(Integer id) {
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
            try{

            }catch (Exception err){

            }
      }
}
