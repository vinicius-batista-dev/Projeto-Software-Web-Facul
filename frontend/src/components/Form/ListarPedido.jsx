import React, { Component } from "react";
import ApiService from "../ApiServices/ApiService";
import "bootstrap/dist/css/bootstrap.min.css";
import "../estilo/style.css";

class ListarPedidosComponent extends Component {

  //o props também objeto
  //É UM METODO PARA INICIALIZAR O ESTADO DE UM OBJETO EM UMA CLASSE
  constructor(props) {
    //SUPER USADO PARA INJETAR AS PROPRIEDADES PROPS ASSIM QUE O CONSTRUCTOR FOR CHAMADO
    super(props);
    //O STATE SERVE PARA GUARDAR INFORMAÇÕES QUE INFLUENCIAM NO RESULTADO DA RENDERIZAÇÃO
    this.state = {
      pedidos: [],
    };
     //PARA QUE UM METODO DE CLASSE SEJA PASSADO EM PROPS USAMOS O THIS
    //O método bind() cria uma nova função.
    this.carregarPedidos = this.carregarPedidos.bind(this);
  }

  //esse metodo é executado depois que a funcao foi criada
  componentDidMount() {
    this.carregarPedidos();
  }

  //Essa nova funcao pode ser chamada aqui com seus argumentos
  removerPedido(id) {
    ApiService.excluirPedidoById(id).then((res) => {
      //o componente responde renderizando novamente
      this.setState({
        pedidos: this.state.pedidos.filter((pedidos) => pedidos.id !== id),
      });
    });
  }

  carregarPedidos() {
    ApiService.listarPedidos()
      .then((res) => {
        this.setState({ pedidos: res.data });
      })
      .catch((err) => {
        console.log("Nao foi possivel listar os pedidos");
      });
  }

  onChange = (e) => {
    this.setState({ [e.target.name]: e.target.value });
  };

  render() {
    return (
      <div className="list-group">
        <br></br>

        <br></br>
        <table class="table table-dark table-borderless">
          <thead>
            <tr>
              <th scope="col">id</th>
              <th scope="col">nome</th>
              <th scope="col">sobrenome</th>
              <th scope="col">endereco</th>
              <th scope="col">celular</th>
              <th scope="col">cpf</th>
              <th scope="col">cidade</th>
              <th scope="col">estado</th>
              <th scope="col">Ações</th>
            </tr>
          </thead>

          <tbody>
            {/* // invoca a função callback passada por argumento para cada elemento */}
            {this.state.pedidos.map((pedidos) => (
              <tr>
                <td>{pedidos.id}</td>
                <td>{pedidos.nome}</td>
                <td>{pedidos.sobrenome}</td>
                <td>{pedidos.endereco}</td>
                <td>{pedidos.celular}</td>
                <td>{pedidos.cpf}</td>
                <td>{pedidos.cidade}</td>
                <td>{pedidos.estado}</td>

                <td>
                  <button
                    className="btn btn-success"
                    onClick={() => this.removerPedido(pedidos.id)}
                  >
                    Remover
                  </button>
                </td>
                <td>
                  <a href="http://localhost:3000/adicionar">
                    <button
                      className="btn btn-danger"
                      
                    >
                      Adicionar
                    </button>
                  </a>
                </td>
              </tr>
            ))}
          </tbody>
        </table>

        <td>
          <a href="http://localhost:3000/adicionar">
            <button
              className="btn btn-danger"
              onClick={() => this.adicionarPedido}
            >
              Adicionar
            </button>
          </a>
        </td>
      </div>
    );
  }
}

export default ListarPedidosComponent;
