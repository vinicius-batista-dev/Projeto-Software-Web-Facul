package com.project.cmp1491.Backend.entidade;

import javax.persistence.*;
@Entity
//Indica ao Spring que esta é uma classe de Entidade
@Table(name = "pedido")
//Nome da tabela no banco de dados que sera mapeada nesse Objeto, ou seja objeto pedidos
public class Pedido {

    @Column(name = "id")
    @Id
    //Indica o atributo que é chave primaria da tabela PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Indica a geracao automatica e sequencial do campo
    private Integer id;

    @Column(name = "nomecliente")
    private String nomecliente;

    @Column(name = "enderecoliente")
    private String enderecocliente;

    @Column(name = "cidadecliente")
    private String cidadecliente;

    @Column(name = "estadocliente")
    private String estadocliente;

    @Column(name = "telefonecliente")
    private Integer telefonefixo;

    @Column(name = "mobilecliente")
    private Integer mobile;

    @Column(name = "cpfcliente")
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
