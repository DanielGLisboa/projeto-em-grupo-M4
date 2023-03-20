package com.api.ValdisneiStreaming.model;

import jakarta.persistence.*;

@Entity
@Table(name="Ator")
public class AtorModel extends ArtistaModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="formacao")
    private String formacao;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
