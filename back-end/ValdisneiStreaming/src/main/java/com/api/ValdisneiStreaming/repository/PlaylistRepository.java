package com.api.ValdisneiStreaming.repository;


import com.api.Valdisnei.model.PlaylistModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlaylistRepository extends CrudRepository <PlaylistModel, Integer> {


    //listar todas as playllist
    List <PlaylistModel> findAll();

    // pegar uma playlist por codigo
    PlaylistModel findByCodigo(int id);

    // remover uma playlist
    void delete (PlaylistModel playlist);
    
     // cadastrar ou alterar uma playlist
    PlaylistModel save (PlaylistModel playlist);


    void delete(Optional<PlaylistModel> playlist);
}
