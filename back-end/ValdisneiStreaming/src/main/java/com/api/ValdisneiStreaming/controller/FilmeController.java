package com.api.ValdisneiStreaming.controller;

import com.api.ValdisneiStreaming.model.filme.FilmeModel;
import com.api.ValdisneiStreaming.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apivaldisnei")
public class FilmeController {

    @Autowired
    private FilmeRepository acoes;

    @GetMapping("/filmes")
    public  @ResponseBody List<FilmeModel> get(){
        return acoes.findAll();
    }

}
