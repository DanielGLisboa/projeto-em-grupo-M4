package com.api.ValdisneiStreaming.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class MidiasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="titulo", nullable = false)
    private String Titulo;

    @Column(name="ano", nullable = false)
    private int ano;

    @Column(name="genero", nullable = false)
    private String genero;

    @Column(name="duracao", nullable = false)
    private double duracao;

    public int getId() {
        return id;
    }
    public String getTitulo() {
        return Titulo;
    }


    public int getAno() {
        return ano;
    }


    public String getGenero() {
        return genero;
    }

}
