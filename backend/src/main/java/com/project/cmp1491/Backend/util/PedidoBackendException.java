package com.project.cmp1491.Backend.util;

import org.springframework.http.HttpStatus;

import org.springframework.web.server.ResponseStatusException;

//Classe que encapsula as excecoes do backend, mandar se tiver um error, uma mensagem
public class PedidoBackendException extends ResponseStatusException{
    public PedidoBackendException(String mensagem){
        super(HttpStatus.INTERNAL_SERVER_ERROR,mensagem);
    }
}
