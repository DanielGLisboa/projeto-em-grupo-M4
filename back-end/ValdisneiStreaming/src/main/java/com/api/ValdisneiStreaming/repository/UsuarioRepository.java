package com.api.ValdisneiStreaming.repository;

import com.api.ValdisneiStreaming.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, String > {
    //Listar
    List<UsuarioModel> findAll();
    //Pesquisar por email
    UsuarioModel findByEmail(String email);
    //Remover
    void deleteByEmail(UsuarioModel email);
    //Cadastrar/Alterar
    <Umodel extends UsuarioModel> Umodel save (Umodel email);

}
