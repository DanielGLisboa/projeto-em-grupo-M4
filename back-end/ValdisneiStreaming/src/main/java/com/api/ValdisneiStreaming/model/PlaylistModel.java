package com.api.ValdisneiStreaming.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

//import java.util.Random;


@Getter
@Setter
@Entity
@Table (name = "Playlist")
public class PlaylistModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="titulo", nullable = false)
    private String titulo;

    @Column(name="ordemExecucao", nullable = false)
    private String ordemExecucao;

    @ManyToMany(mappedBy = "playlists", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"playlists"})
    private List<BibliotecaModel> bibliotecas = new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="aux_playlist_filmes",
            joinColumns = @JoinColumn(name="id_playlist", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_filmes", referencedColumnName = "id")
    )
    @JsonIgnoreProperties({ "playlists" })
    private List<FilmeModel> filmes = new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="aux_playlist_series",
            joinColumns = @JoinColumn(name="id_playlist", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_series", referencedColumnName = "id")
    )
    @JsonIgnoreProperties({ "playlists" })
    private List<SerieModel> series = new ArrayList<>();


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="aux_playlist_musicas",
            joinColumns = @JoinColumn(name="id_playlist", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_musicas", referencedColumnName = "id")
    )
    @JsonIgnoreProperties({ "playlists" })
    private List<MusicaModel> musicas = new ArrayList<>();


//
//    public void prox_midia(){
//        for(int i=0; midias.length<i; i++){
//            System.out.println("tocando proxima midia");
//            this.prox_midia();
//        }
//
//    }
//
//    public void midia_anterior(){
//        for(int i=midias.length; i>=0; i--){
//            System.out.println("tocando midia anterior:" + midias[i]);
//            this.midia_anterior();
//
//        }
//    }
//
//
//    public void misturar_midias() {
//        Random embaralhar = new Random();
//        String[] midias = this.midias;
//        for (int i = 0; i < midias.length; i++) {
//            int rand = embaralhar.nextInt(midias.length);
//            int valor_inicial = this.ordemExecucao[i];
//            this.ordemExecucao[i] = this.ordemExecucao[rand];
//            this.ordemExecucao[rand] = valor_inicial;
//        }
//    }
}











