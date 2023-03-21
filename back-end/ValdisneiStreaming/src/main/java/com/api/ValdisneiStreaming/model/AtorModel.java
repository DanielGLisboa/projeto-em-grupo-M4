package com.api.ValdisneiStreaming.model;

import jakarta.persistence.*;

@Entity
@Table(name="Ator")
public class AtorModel extends ArtistaModel{
    @Column(name="formacao")
    private String formacao;


    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
