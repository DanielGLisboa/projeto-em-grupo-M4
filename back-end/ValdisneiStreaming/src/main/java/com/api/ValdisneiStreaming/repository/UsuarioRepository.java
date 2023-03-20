package com.api.Valdisnei.repository;

import com.api.Valdisnei.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer > {
    //Listar
    List<UsuarioModel> findAll();
    //Pesquisar por email
    UsuarioModel findByEmail(String email);
    //Remover
    void delete(UsuarioModel email);
    //Cadastrar/Alterar
    <Umodel extends UsuarioModel> Umodel save (Umodel email);

}
