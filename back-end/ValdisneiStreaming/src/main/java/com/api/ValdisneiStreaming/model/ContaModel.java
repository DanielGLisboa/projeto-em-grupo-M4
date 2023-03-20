package com.api.Valdisnei.model;

import jakarta.persistence.*;

@Entity
@Table(name = "conta")
public class ContaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int  id;
    @OneToOne
    @JoinColumn(name="email", referencedColumnName = "email")
    private UsuarioModel usuarioModel;
    @Column(name="usuario", nullable = false)
    private String usuario;
    @Column(name="senha", nullable = false)
    private String senha;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public UsuarioModel getUsuarioModel() {
        return usuarioModel;
    }

    public void setUsuarioModel(UsuarioModel usuarioModel) {
        this.usuarioModel = usuarioModel;
    }
}
