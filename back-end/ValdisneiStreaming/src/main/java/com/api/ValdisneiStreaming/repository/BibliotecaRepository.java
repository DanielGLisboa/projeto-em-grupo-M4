package com.api.ValdisneiStreaming.repository;

import com.api.ValdisneiStreaming.model.BibliotecaModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BibliotecaRepository extends CrudRepository <BibliotecaModel,Integer> {
    //Listar
    List<BibliotecaModel>findAll();
    //Pesquisar por usuario
    BibliotecaModel findByUsuario(Integer usuario);
    //Remover
    void delete(BibliotecaModel usuario);
    //Cadastrar/Alterar
    <Bmodel extends BibliotecaModel> Bmodel save (Bmodel usuario);

}
