package com.api.ValdisneiStreaming.repository;

import com.api.ValdisneiStreaming.model.MusicaModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MusicaRepository extends CrudRepository<MusicaModel, Integer> {

    List<MusicaModel> findAll();

    MusicaModel findById(int id);

    // remover uma playlist
    void delete (MusicaModel playlist);

    // cadastrar ou alterar uma playlist
    <MusicaMod extends MusicaModel> MusicaMod save(MusicaMod musica);

}
