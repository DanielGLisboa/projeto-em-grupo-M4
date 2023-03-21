package com.api.ValdisneiStreaming.model;

import jakarta.persistence.*;

@Entity
@Table(name="Musico")
public class MusicoModel extends ArtistaModel{
    @Column(name="atuacao")
    private String atuacao;

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
}
