package com.project.cmp1491.Backend.entidade;

import javax.persistence.*;
//Marca uma classe como uma entidade persistente
@Entity
@Table(name = "pedido")
//Informa o nome da tabela que será mapeada a classe em questão
public class Pedido {

    @Column(name = "id")
    @Id
    //Marca o atributo como identificador da classe
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   //Define a estratégia de incremento de um atributo
    private Integer id;

    @Column(name = "nome-do-cliente")
    private String nomecliente;

    @Column(name = "endereco-do-cliente")
    private String enderecocliente;

    @Column(name = "cidade-do-cliente")
    private String cidadecliente;

    @Column(name = "estado-do-cliente")
    private String estadocliente;

    @Column(name = "telefone-fixo")
    private Integer telefonefixo;

    @Column(name = "mobile")
    private Integer mobile;

    @Column(name = "cpf")
    private Integer cpf;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getEnderecocliente() {
        return enderecocliente;
    }

    public void setEnderecocliente(String enderecocliente) {
        this.enderecocliente = enderecocliente;
    }

    public String getCidadecliente() {
        return cidadecliente;
    }

    public void setCidadecliente(String cidadecliente) {
        this.cidadecliente = cidadecliente;
    }

    public String getEstadocliente() {
        return estadocliente;
    }

    public void setEstadocliente(String estadocliente) {
        this.estadocliente = estadocliente;
    }

    public Integer getTelefonefixo() {
        return telefonefixo;
    }

    public void setTelefonefixo(Integer telefonefixo) {
        this.telefonefixo = telefonefixo;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
}
