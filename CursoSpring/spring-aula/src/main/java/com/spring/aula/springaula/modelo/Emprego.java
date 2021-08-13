package com.spring.aula.springaula.modelo;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;


@Entity
public class Emprego {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 5)
    private String titulo;

    @NotNull
    @Size(min = 2)
    private String empresa;

    @NotNull
    @Size(min = 1, max = 40)
    private String descricao;




}
