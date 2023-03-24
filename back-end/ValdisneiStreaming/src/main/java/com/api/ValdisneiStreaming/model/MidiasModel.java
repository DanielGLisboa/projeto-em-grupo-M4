package com.api.ValdisneiStreaming.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@MappedSuperclass
public abstract class MidiasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="titulo", nullable = false)
    private String Titulo;
    @Column(name="capa", nullable = false)
    private String capa;

    @Column(name="ano", nullable = false)
    private int ano;

    @Column(name="genero", nullable = false)
    private String genero;

    @Column(name="duracao", nullable = false)
    private double duracao;


}
