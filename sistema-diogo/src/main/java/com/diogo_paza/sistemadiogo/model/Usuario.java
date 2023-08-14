package com.diogo_paza.sistemadiogo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String senha;

    @PrePersist
    public void codificarSenha(){

    }
}
