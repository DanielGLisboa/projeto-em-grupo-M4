package com.api.ValdisneiStreaming.model.filme;

import com.api.ValdisneiStreaming.model.MidiasModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="filme")
public class FilmeModel extends MidiasModel {

    @Column(name="tipo", nullable = false)
    private String tipo;

    @Column(name="elenco", nullable = false)
    private String elenco;

    @Column(name="diretor", nullable = false)
    private String diretor;
    @Column(name="produtor", nullable = false)
    private String produtor;

    public String getTipo() {
        return tipo;
    }

    public String getElenco() {
        return elenco;
    }

    public String getDiretor() {
        return diretor;
    }


    public String getProdutor() {
        return produtor;
    }

}
