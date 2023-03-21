package com.api.ValdisneiStreaming.repository;

import com.api.ValdisneiStreaming.model.FilmeModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmeRepository extends CrudRepository<FilmeModel, Integer> {

    List<FilmeModel> findAll();

}
