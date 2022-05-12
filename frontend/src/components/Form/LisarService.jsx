class FormService extends Component {
    constructor(props) {
      super(props);
      this.state = {
        id: "",
        nome: "",
        sobrenome: "",
        endereco: "",
        cidade: "",
        estado: "",
        celular: "",
        cpf: "",
        nomeVazio: false,
        sobrenomeVazio: false,
        enderecoVazio: false,
        cidadeVazio: false,
        estadoVazio: false,
        celularVazio: false,
        cpfVazio: false,
      };
      this.savePedido = this.savePedido.bind(this);
    }
  
    savePedido = (e) => {
      this.setState({ nomeVazio: this.state.nome === "" });
      this.setState({ sobrenomeVazio: this.state.sobrenome === "" });
      this.setState({ enderecoVazio: this.state.endereco === "" });
      this.setState({ cidadeVazio: this.state.cidade === "" });
      this.setState({ estadoVazio: this.state.estado === "" });
      this.setState({ celularVazio: this.state.celular === "" });
      this.setState({ cpfVazio: this.state.cpf === "" });
  
      if (this.state.nomeVazio === false && this.state.sobrenomeVazio === false) {
        
        e.preventDefault();
  
        let pedido = {
          id: this.state.id,
          nome: this.state.nome,
          sobrenome: this.state.sobrenome,
          endereco: this.state.endereco,
          cidade: this.state.cidade,
          estado: this.state.estado,
          celular: this.state.celular,
          cpf: this.state.cpf,
        };
  
        ApiService.salvarPedido(pedido)
          .then((res) => {
            alert("Pedido salvo com sucesso");
          })
          .catch((err) => {
            alert("Nao foi possivel deletar pedido");
          });
      }
    };
  
    onChange = (e) => this.setState({ [e.target.name]: e.target.value });
  
    render() {
  
  
      return (
        <Grid>
          <Card style={{ maxWidth: 450, padding: "20px 5px", margin: "0 auto" }}>
            <LocalDiningIcon class="fast" />
  
            <CardContent>
              <Typography gutterBottom variant="h5">
                Bem Vindo, Página do Cliente
              </Typography>
  
              <br />
              
              <form onSubmit={this.savePedido}>
                <Grid container spacing={2}>
                  <Grid xs={12} sm={6} item>
                  <TextField
                      id="nome"
                      autoComplete="off"
                      name="nome"
                      label="nome"
                      fullWidth
                      variant="outlined"
                      placeholder="Nome"
                      type="text"
                      value={this.state.nome}
                      onChange={this.onChange}
                      helperText={
                        this.state.nomeVazio ? "Preencha o campo" : null
                      }
                      error={this.state.nomeVazio}
                    />
                  </Grid>
                  <Grid xs={12} sm={6} item>
                    <TextField
                      id="sobrenome"
                      name="sobrenome"
                      autoComplete="off"
                      label="sobrenome"
                      fullWidth
                      variant="outlined"
                      placeholder="Nome"
                      type="text"
                      value={this.state.sobrenome}
                      onChange={this.onChange}
                      helperText={
                        this.state.sobrenomeVazio ? "Preencha o campo" : null
                      }
                      error={this.state.sobrenomeVazio}
                    />
                  </Grid>
                  <Grid xs={12} sm={6} item>
                  <TextField
                      id="endereco"
                      name="endereco"
                      autoComplete="off"
                      label="endereco"
                      fullWidth
                      variant="outlined"
                      type="text"
                      value={this.state.endereco}
                      onChange={this.onChange}
                      helperText={
                        this.state.enderecoVazio ? "Preencha o campo" : null
                      }
                      error={this.state.enderecoVazio}
                    />
                  </Grid>
                  <Grid xs={12} sm={6} item>
                    <TextField
                       id="celular"
                       name="celular"
                       autoComplete="off"
                       label="celular"
                       fullWidth
                       variant="outlined"
                       type="text"
                       value={this.state.celular}
                       onChange={this.onChange}
                       helperText={
                         this.state.celularVazio ? "Preencha o campo" : null
                       }
                       error={this.state.celularVazio}
                     />
                  </Grid>
  
                  <Grid xs={12} item>
                    <TextField
                       maxLength='14'
                       id="cpf"
                       name="cpf"
                       autoComplete="off"
                       label="cpf"
                       fullWidth
                       variant="outlined"
                       type="text"
                       value={this.state.cpf}
                       onChange={this.onChange}
                       helperText={
                         this.state.cpfVazio ? "Preencha o campo" : null
                       }
                       error={this.state.cpfVazio}
                     />
                  </Grid>
                  <Grid item xs={12}>
                    <TextField
                      id="cidade"
                      name="cidade"
                      autoComplete="off"
                      label="cidade"
                      fullWidth
                      variant="outlined"
                      type="text"
                      value={this.state.cidade}
                      onChange={this.onChange}
                      helperText={
                        this.state.cidadeVazio ? "Preencha o campo" : null
                      }
                      error={this.state.cidadeVazio}
                    />
                  </Grid>
  
                  <Grid item xs={12}>
                    <TextField
                      id="estado"
                      name="estado"
                      autoComplete="off"
                      label="estado"
                      fullWidth
                      variant="outlined"
                      type="text"
                      value={this.state.estado}
                      onChange={this.onChange}
                      helperText={
                        this.state.estadoVazio ? "Preencha o campo" : null
                      }
                      error={this.state.estadoVazio}
                    />
                  </Grid>
  
                  <Grid item xs={12}>
                    <Button
                      size="large"
                      type="Enviar"
                      variant="contained"
                      back
                      fullWidth
                      onClick={(e) => {
                        this.savePedido(e);
                      }}
                    >
                      Reload
                    </Button>
                  </Grid>
                </Grid>
              </form>
            </CardContent>
          </Card>
        </Grid>
      );
    }
  }
  
  export default FormService;
  