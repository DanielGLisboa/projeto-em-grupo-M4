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
@Table(name="Ator")
public class AtorModel extends ArtistaModel{
    @Column(name="formacao")
    private String formacao;


    @ManyToMany(mappedBy = "atores", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties({ "atores", "playlists"})
    private List<FilmeModel> filmes = new ArrayList<>();

    @ManyToMany(mappedBy = "atores", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties({ "atores", "playlists"})
    private List<SerieModel> series = new ArrayList<>();

}
