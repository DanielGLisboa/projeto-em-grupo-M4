package com.api.ValdisneiStreaming.controller;


import com.api.ValdisneiStreaming.model.PlaylistModel;
import com.api.ValdisneiStreaming.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.Optional;


@RestController
@RequestMapping("/apivaldisnei")
public class PlaylistControler {

    @Autowired
    private PlaylistRepository acoes;

    @GetMapping("/playlist")
    public @ResponseBody List<PlaylistModel> listar(){return acoes.findAll();}


    @PostMapping
    public @ResponseBody PlaylistModel cadastrar (@RequestBody PlaylistModel nova_playlist){return acoes.save(nova_playlist);}


    @PutMapping
    public @ResponseBody PlaylistModel alterar (@RequestBody PlaylistModel alterar_playlist){return acoes.save(alterar_playlist);}


//    @RequestMapping(value="/playlist/{id}", method = RequestMethod.GET)
//    public @ResponseBody Optional<PlaylistModel> filtrar (@PathVariable int id){return acoes.findById(id);}

    @RequestMapping(value="/playlist/{id}", method = RequestMethod.DELETE)
    public @ResponseBody void deletar(@PathVariable int id){
        PlaylistModel playlist = acoes.findById(id);
        this.acoes.delete(playlist);

    }


}





