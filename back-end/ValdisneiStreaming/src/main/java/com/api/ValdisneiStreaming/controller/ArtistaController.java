package com.api.ValdisneiStreaming.controller;

import com.api.ValdisneiStreaming.model.ArtistaModel;
import com.api.ValdisneiStreaming.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apivaldisnei")
public class ArtistaController {
    //@Autowired objeto que informa ao spring quais ações que influenciam nosso repositório.
    @Autowired
    private ArtistaRepository acoes;

    @RequestMapping(value ="/Artista",method = RequestMethod.GET)
    //@responsebody- atravez do corpo da pagina retorne
    public @ResponseBody List<ArtistaModel> listar(){
        return acoes.findAll();
    }

    //Metodo cadastrar Artista
    @RequestMapping(value="/Artista",method = RequestMethod.POST)
    public @ResponseBody ArtistaModel cadastrar(@RequestBody ArtistaModel nome){
        return acoes.save(nome);
    }
    //Alterar cadastro
    @RequestMapping(value="/Artista",method = RequestMethod.PUT)
    public @ResponseBody ArtistaModel alterar(@RequestBody ArtistaModel nome){
        return acoes.save(nome);
    }

    @RequestMapping(value = "/Artista/{id}", method =RequestMethod.GET )
    public @ResponseBody ArtistaModel filtrar(@PathVariable int id){
        return acoes.findById(id);
    }

    // fazer metodo deletar
    @RequestMapping(value = "/Artista/{id}", method = RequestMethod.DELETE)
    public @ResponseBody void remover(@PathVariable int id){
        ArtistaModel artista = filtrar(id);
        this.acoes.delete(artista);
    }
}
