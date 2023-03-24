package com.api.ValdisneiStreaming.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Musico")
public class MusicoModel extends ArtistaModel{
    @Column(name="atuacao")
    private String atuacao;

}
