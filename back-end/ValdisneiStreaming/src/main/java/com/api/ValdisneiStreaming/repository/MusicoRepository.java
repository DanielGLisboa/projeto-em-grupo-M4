package com.api.ValdisneiStreaming.repository;

import com.api.ValdisneiStreaming.model.MusicoModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MusicoRepository extends CrudRepository<MusicoModel, Integer> {

    List<MusicoModel> findAll();
    //Pesquisa por id
    MusicoModel findById(int id) ;
    //Comando deletar cadastro artista- Utilização ADM
    void delete(MusicoModel nome);
    //Cadastrar ou alterar artista- Utilização ADM
    <ProdMod extends MusicoModel> ProdMod save(ProdMod nome);
}