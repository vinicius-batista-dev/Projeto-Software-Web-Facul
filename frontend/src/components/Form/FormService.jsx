import { Component } from "react";
import TextField from "@mui/material/TextField";

class FormServiceMaterialComponent extends Component{
    constructor(props){
        super(props);
        this.state = {
            id: '',
            nome: '',
            endereco: '',
            cidade: '',
            estado: '',
            telefone: '',
            mobile: '',
            cpf: '',
            nomeVazio: false,
            cidade: false
        }
    }
}