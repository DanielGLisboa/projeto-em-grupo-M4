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
@Table(name="serie")
public class SerieModel extends MidiasModel{

    @Column(name="sinopse", nullable = false)
    private String sinopse;
    @Column(name="banner", nullable = false)
    private String banner;

    @Column(name="diretor", nullable = false)
    private String diretor;
    @Column(name="produtor", nullable = false)
    private String produtor;

    @Column(name="quantidade_temporadas", nullable = false)
    private int quantidadeTemps;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="aux_serie_atores",
            joinColumns = @JoinColumn(name="id_serie", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_ator", referencedColumnName = "id")
    )
    @JsonIgnoreProperties({"series"})
    private List<AtorModel> atores = new ArrayList<>();

    @ManyToMany(mappedBy = "series", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<PlaylistModel> playlists = new ArrayList<>();
}
