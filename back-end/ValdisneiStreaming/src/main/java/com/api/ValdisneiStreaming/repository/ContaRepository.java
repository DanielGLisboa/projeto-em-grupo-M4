package com.api.Valdisnei.repository;

import com.api.Valdisnei.model.ContaModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContaRepository extends CrudRepository <ContaModel, Integer> {
    //Listar
    List<ContaModel> findAll();
    //Pesquisar por usuario
    ContaModel findByUsuario(Integer usuario);
    //Remover
    void delete(ContaModel usuario);
    //Cadastrar/Alterar
    <Cmodel extends ContaModel> Cmodel save (Cmodel usuario);
}

