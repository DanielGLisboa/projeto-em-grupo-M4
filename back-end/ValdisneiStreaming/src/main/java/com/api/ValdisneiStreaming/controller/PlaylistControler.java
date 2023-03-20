package com.api.ValdisneiStreaming.controller;


import com.api.Valdisnei.model.PlaylistModel;
import com.api.Valdisnei.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/streamingvaldisnei")
public class PlaylistControler {

    @Autowired
    private PlaylistRepository acoes;

    @RequestMapping(value="/streamingvaldisnei", method = RequestMethod.GET)
    public @ResponseBody List<PlaylistModel> listar(){return acoes.findAll();}


    @RequestMapping(value="/streamingvaldisnei", method = RequestMethod.POST)
    public @ResponseBody PlaylistModel cadastrar (@RequestBody PlaylistModel nova_playlist){return acoes.save(nova_playlist);}


    @RequestMapping(value="/streamingvaldisnei", method = RequestMethod.PUT)
    public @ResponseBody PlaylistModel alterar (@RequestBody PlaylistModel alterar_playlist){return acoes.save(alterar_playlist);}


    @RequestMapping(value="/streamingvaldisnei/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<PlaylistModel> filtrar (@PathVariable int id){return acoes.findById(id);}

    @RequestMapping(value="/streamingvaldisnei/{id}", method = RequestMethod.DELETE)
    public @ResponseBody void deletar (@PathVariable int id){
        Optional<PlaylistModel> playlist = filtrar(id);
        this.acoes.delete(playlist);

    }


}





