import React, { Component } from "react";
import ApiService from "../ApiServices/ApiService";
import "bootstrap/dist/css/bootstrap.min.css";
import "../estilo/style.css";


class ListarPedidosComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      pedidos: [],
    };
    this.carregarPedidos = this.carregarPedidos.bind(this);
  }

  

  componentDidMount() {
    this.carregarPedidos();
  }



   removerPedido(id) {
     ApiService.excluirPedidoById(id).then((res) => {
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

  render() 
  {


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
                  <button
                    className="btn btn-warning"
                    onClick={() => this.editarPedido(pedidos.id)}
                  >
                    Editar
                  </button>
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
