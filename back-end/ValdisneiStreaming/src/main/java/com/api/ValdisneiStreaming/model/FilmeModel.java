package com.api.ValdisneiStreaming.model;

import com.api.ValdisneiStreaming.model.MidiasModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="filme")
public class FilmeModel extends MidiasModel {

    @Column(name="tipo", nullable = false)
    private String tipo;

    @Column(name="sinopse", nullable = false)
    private String sinopse;

    @Column(name="banner", nullable = false)
    private String banner;

    @Column(name="diretor", nullable = false)
    private String diretor;
    @Column(name="produtor", nullable = false)
    private String produtor;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="aux_filme_atores",
            joinColumns = @JoinColumn(name="id_filme", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_ator", referencedColumnName = "id")
    )
    @JsonIgnoreProperties({ "filmes" })
    private List<AtorModel> atores = new ArrayList<>();


    @ManyToMany(mappedBy = "filmes", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties({ "filmes" })
    private List<PlaylistModel> playlists = new ArrayList<>();


}
