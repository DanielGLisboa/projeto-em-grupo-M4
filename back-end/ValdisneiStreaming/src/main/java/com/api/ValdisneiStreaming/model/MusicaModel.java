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
@Table(name="musica")
public class MusicaModel extends MidiasModel {


    @Column(name="artista", nullable = false)
    private String artista;

    @Column(name="nota", nullable = false)
    private int nota;


    @ManyToMany(mappedBy = "musicas", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"musicas"})
    private List<PlaylistModel> playlists = new ArrayList<>();

}
