package com.api.ValdisneiStreaming.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@MappedSuperclass
public class ArtistaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="nome")
    private String nome;
    @Column(name="data_de_nascimento")
    private String dataDeNascimento;
    @Column(name="genero")
    private String genero;

    @Column(name="premiacao")
    private String premiacao;

}
