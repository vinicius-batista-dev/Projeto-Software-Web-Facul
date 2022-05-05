import { Component, useState } from "react";
import {
    Grid,
    TextField,
    Button,
    Card,
    CardContent,
    Typography,
    FormControlLabel
  } from "@material-ui/core";
import React from "react";
import LocalDiningIcon from '@mui/icons-material/LocalDining';
import "../estilo/style.css";
import { cpfMask } from "../Validator/cpfMask";

class FormService extends Component {
 
  constructor(props) {
    super(props);

    this.state = { documentId: "" };
    this.handlechange = this.handlechange.bind(this);
  }

  handlechange(e) {
    this.setState({ documentId: cpfMask(e.target.value) });
  }


  render() {
    const { documentId } = this.state;

    return (
      
        <Grid>
          <Card
            style={{ maxWidth: 450, padding: "20px 5px", margin: "0 auto" }}
          >
             <LocalDiningIcon class='fast' />

            <CardContent>
              <Typography gutterBottom variant="h5">
                Bem Vindo, Página do Cliente
              </Typography>

            <br />

              <form>

                <Grid container spacing={2}>
                  <Grid xs={12} sm={6} item>
                    <TextField
                      placeholder="Entre com o seu nome"
                      label="Nome"
                      variant="outlined"
                      fullWidth
                    />
                  </Grid>
                  <Grid xs={12} sm={6} item>
                    <TextField
                      placeholder="Entre com o sobrenome"
                      label="Sobrenome"
                      variant="outlined"
                      fullWidth
                    />
                  </Grid>
                  <Grid xs={12} sm={6} item>
                    <TextField
                      type="text"
                      placeholder="Seu endereço"
                      label="Endereço"
                      variant="outlined"
                      fullWidth
                    />
                  </Grid>
                  <Grid xs={12} sm={6} item>
                    <TextField
                      type="number"
                      placeholder="062 123456789"
                      label="Celular"
                      variant="outlined"
                      name="mobileno"
                      mask="000 000 0000"
                      fullWidth
                    />
                  </Grid>
                  <Grid xs={12} sm={6} item>
                    <TextField
                      type="number"
                      placeholder="CEP"
                      label="CEP"
                      variant="outlined"
                      fullWidth
                    />
                  </Grid>
                  <Grid xs={12} sm={6} item>
                    <TextField
                      maxWidth="14"
                      type="text"
                      placeholder="CPF"
                      label="CPF"
                      name="documentId"
                      value={documentId}
                      onChange={this.handlechange}
                      fullWidth
                    />
                  </Grid>
                  <Grid item xs={12}>
                    <TextField
                      type="text"
                      placeholder="Cidade"
                      label="Cidade"
                      variant="outlined"
                      fullWidth
                    />
                  </Grid>
                  
                  <Grid item xs={12}>
                    <TextField
                      type="text"
                      placeholder="Estado"
                      label="Estado"
                      variant="outlined"
                      fullWidth
                    />
                  </Grid>
                  <Grid item xs={12}>
                    <TextField
                      label="O que acha de nosso serviço"
                      multiline
                      rows={4}
                      placeholder="Escreva alguma coisa"
                      variant="outlined"
                      fullWidth
                    />
                  </Grid>
    
                  <Grid item xs={12}>
                    <Button
                      size="large"
                      type="Enviar"
                      variant="contained"
                      back
                      fullWidth
                    >
                      Enviar
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
