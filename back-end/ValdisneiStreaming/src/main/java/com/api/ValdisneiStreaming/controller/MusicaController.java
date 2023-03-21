package com.api.ValdisneiStreaming.controller;

import com.api.ValdisneiStreaming.model.MusicaModel;
import com.api.ValdisneiStreaming.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apivaldisnei")
public class MusicaController {

    @Autowired
    private MusicaRepository acoes;

    @GetMapping("/musica")
    public @ResponseBody List<MusicaModel> get(){
        return acoes.findAll();
    }

}
