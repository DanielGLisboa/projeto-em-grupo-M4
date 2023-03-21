package com.api.ValdisneiStreaming.model;

import jakarta.persistence.*;

@Entity
@Table(name = "biblioteca")
public class BibliotecaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column
    private String usuario;
//    @OneToMany
//    @JoinColumn(name = "biblioteca_playlists")
//    private List<Playlist> playlists;
//    //playlists

    //getters and setters
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

//    public List<Playlist> getPlaylists() {
//        return playlists;
//    }
//
//    public void setPlaylists(List<Playlist> playlists) {
//        this.playlists = playlists;
//    }
}
