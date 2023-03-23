package com.api.ValdisneiStreaming.repository;

import com.api.ValdisneiStreaming.model.SerieModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SerieRepository extends CrudRepository<SerieModel, Integer> {

    List<SerieModel> findAll();

    SerieModel findById(int id);

    // remover uma playlist
    void delete (SerieModel playlist);

    // cadastrar ou alterar uma playlist
    <SerieMod extends SerieModel> SerieMod save(SerieMod serie);

}
