import axios from "axios"

const url = 'http://localhost:8080';

axios.defaults.headers.post['Access-Control-Allow-Origin'] = '*';

class ApiService{
    listarPedidos(){
        return axios.get(url + '/listar-pedidos')
    }
    consultarPedidoById(pedidoId){
        return axios.get(url + '/consultar-pedido/' + pedidoId)
    }
    salvarPedido(pedido){
        return axios.post(url + '/salvar-pedido/', pedido);
    }
    excluirPedidoById(pedidoId){
        return axios.delete(url + '/excluir-pedido/' + pedidoId);
    }
}

export default new ApiService();