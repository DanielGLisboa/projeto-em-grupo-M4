package com.api.ValdisneiStreaming.model;

import jakarta.persistence.*;

@Entity
@Table(name="Musico")
public class MusicoModel extends ArtistaModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="atuacao")
    private String atuacao;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
}
