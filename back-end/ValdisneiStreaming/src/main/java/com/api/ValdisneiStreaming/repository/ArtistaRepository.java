package com.api.ValdisneiStreaming.repository;

import com.api.ValdisneiStreaming.model.ArtistaModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArtistaRepository extends CrudRepository<ArtistaModel, Integer > {
    //Mysql-> SELECT* FROM = Spring -> findAll() | Localizar todos
    List<ArtistaModel> findAll();
    //Pesquisa por id
    ArtistaModel findById(int id) ;
    //Comando deletar cadastro artista- Utilização ADM
    void delete(ArtistaModel nome);
    //Cadastrar ou alterar artista- Utilização ADM
    <ProdMod extends ArtistaModel> ProdMod save(ProdMod nome);

}
