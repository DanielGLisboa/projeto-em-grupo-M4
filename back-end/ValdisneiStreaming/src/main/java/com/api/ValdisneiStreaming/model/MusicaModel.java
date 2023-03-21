package com.api.ValdisneiStreaming.model;


import com.api.ValdisneiStreaming.model.MidiasModel;
import jakarta.persistence.*;

@Entity
@Table(name="musica")
public class MusicaModel extends MidiasModel {


    @Column(name="artista", nullable = false)
    private String artista;

    @Column(name="nota", nullable = false)
    private int nota;


    public String getArtista() {
        return artista;
    }

    public int getNota() {
        return nota;
    }
}
