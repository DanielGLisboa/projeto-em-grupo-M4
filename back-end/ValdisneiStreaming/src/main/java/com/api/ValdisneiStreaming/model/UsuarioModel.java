package com.api.ValdisneiStreaming.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table (name="usuario")
public class UsuarioModel {
    @Id
    @Column(name = "email")
    private String email;

    @Column(name="nome")
    private String nome;

    @Column(name="senha", nullable = false)
    private String senha;

}
