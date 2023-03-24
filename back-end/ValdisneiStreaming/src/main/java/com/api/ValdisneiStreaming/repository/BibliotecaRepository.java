package com.api.ValdisneiStreaming.repository;

import com.api.ValdisneiStreaming.model.BibliotecaModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BibliotecaRepository extends CrudRepository <BibliotecaModel, Integer> {
    //Listar
    List<BibliotecaModel>findAll();
    //Pesquisar por usuario
    BibliotecaModel findById( int id);
    //Remover
    void delete(BibliotecaModel id);
    //Cadastrar/Alterar
    <Bmodel extends BibliotecaModel> Bmodel save (Bmodel biblioteca);

}
