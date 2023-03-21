package com.api.ValdisneiStreaming.model;

import jakarta.persistence.*;

//import java.util.Random;



@Entity
@Table (name = "Playlist")
public class PlaylistModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="midias", nullable = false)
    private String [] midias;

    @Column(name="ordemExecucao", nullable = false)
    private int[] ordemExecucao;

    private String midiaAtual;


    public String[] getMidias() {
        return midias;
    }

    public void setMidias(String[] midias) {
        this.midias = midias;
    }

    public int[] getOrdemExecucao() {
        return ordemExecucao;
    }

    public void setOrdemExecucao(int[] ordemExecucao) {
        this.ordemExecucao = ordemExecucao;
    }

    public String getMidiaAtual() {
        return midiaAtual;
    }

    public void setMidiaAtual(String midiaAtual) {
        this.midiaAtual = midiaAtual;
    }
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











