package com.project.cmp1491.Backend.entidade;


import javax.persistence.*;

@Entity
//Pedido
@Table(name = "pedido")
public class Pedido {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
