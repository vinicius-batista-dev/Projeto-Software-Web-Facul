package com.project.cmp1491.Backend.entidade;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Objects;

// O objeto é uma entidade que possui estado e comportamento é conhecida

@Entity
//Indica ao Spring que esta é uma classe de Entidade
@Table(name = "pedido")
//Nome da tabela no banco de dados que sera mapeada nesse Objeto, ou seja objeto pedidos
public class Pedido {

    // vai mapear o campo da entidade com uma coluna do banco de dados.
    @Column(name = "id")
    @Id
    //Indica o atributo que é chave primaria da tabela PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Indica a geracao automatica e sequencial do campo
    private Integer id;
    // vai mapear o campo da entidade com uma coluna do banco de dados.
    @Column(nullable = false, name = "nome")
    private String nome;
    // vai mapear o campo da entidade com uma coluna do banco de dados.
    @Column(nullable = false, name = "sobrenome")
    private String sobrenome;
    // vai mapear o campo da entidade com uma coluna do banco de dados.
    @Column(nullable = false, name = "endereco")
    private String endereco;
    // vai mapear o campo da entidade com uma coluna do banco de dados.
    @Column(nullable = false, name = "cidade")
    private String cidade;
    // vai mapear o campo da entidade com uma coluna do banco de dados.
    @Column(nullable = false, name = "estado")
    private String estado;
    // vai mapear o campo da entidade com uma coluna do banco de dados.
    @Column(nullable = false, name = "celular", length = 11)
    private String celular;

    //vai verificar se o cpf é valido ou nao, a partir do momento quando salvar os dados
    @CPF
    // vai mapear o campo da entidade com uma coluna do banco de dados.
    @Column(nullable = false, name = "cpf")
    private String cpf;

    // Nesses métodos determinamos quando será alterado um atributo e o acesso ao mesmo, tornando o controle e modificações mais práticas e limpas,


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
