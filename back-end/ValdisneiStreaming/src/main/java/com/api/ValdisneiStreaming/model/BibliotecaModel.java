package com.api.ValdisneiStreaming.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "biblioteca")
public class BibliotecaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "email_usuario", referencedColumnName = "email")
    private UsuarioModel usuario;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="aux_biblioteca_playlist",
            joinColumns = @JoinColumn(name="id_biblioteca", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_playlist", referencedColumnName = "id")
    )
    @JsonIgnoreProperties({"bibliotecas"})
    private List<PlaylistModel> playlists = new ArrayList<>();
    //playlists

}
