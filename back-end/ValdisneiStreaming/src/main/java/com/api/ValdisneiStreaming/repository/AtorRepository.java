package com.api.ValdisneiStreaming.repository;

import com.api.ValdisneiStreaming.model.AtorModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AtorRepository extends CrudRepository<AtorModel, Integer> {
    List<AtorModel> findAll();
    //Pesquisa por id
    AtorModel findById(int id) ;
    //Comando deletar cadastro artista- Utilização ADM
    void delete(AtorModel nome);
    //Cadastrar ou alterar artista- Utilização ADM
    <ProdMod extends AtorModel> ProdMod save(ProdMod nome);
}
