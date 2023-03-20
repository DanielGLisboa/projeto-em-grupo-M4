package com.api.ValdisneiStreaming.repository;

import com.api.ValdisneiStreaming.model.musica.MusicaModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MusicaRepository extends CrudRepository<MusicaModel, Integer> {

    List<MusicaModel> findAll();

}
