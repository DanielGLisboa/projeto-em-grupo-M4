package com.api.ValdisneiStreaming.controller;

import com.api.ValdisneiStreaming.model.FilmeModel;
import com.api.ValdisneiStreaming.repository.FilmeRepository;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apivaldisnei")
public class FilmeController {

    @Autowired
    private FilmeRepository acoes;

    @GetMapping("/filme")
    public  @ResponseBody List<FilmeModel> get(){
        return  acoes.findAll();
    }

    @RequestMapping(value = "/filme/{id}" , method= RequestMethod.GET)
    public @ResponseBody FilmeModel filtrar_por_id(@PathVariable int id){
        return acoes.findById(id);
    }


    @RequestMapping(value="/filme", method = RequestMethod.POST)
    public @ResponseBody FilmeModel cadastrar(@RequestBody FilmeModel filme){
        return acoes.save(filme);
    }



    @RequestMapping(value="/filme", method = RequestMethod.PUT)
    public @ResponseBody FilmeModel atualizar( @RequestBody FilmeModel filme){
        return acoes.save(filme);
    }



    @DeleteMapping("/filme/{id}")
    public @ResponseBody String deletar(@PathVariable int id){

        try {
            FilmeModel filme = filtrar_por_id(id);
            acoes.delete(filme);
            return "Filme removido com sucesso.";
        }catch (Exception error){
            return "Falha ao remover filme: " + error.getMessage();
        }

    }

    @RequestMapping(value = "/filme/{id}" , method= RequestMethod.GET)
    public @ResponseBody FilmeModel filtrar_por_id(@PathVariable int id){
        return acoes.findById(id);
    }


    @RequestMapping(value="/filme", method = RequestMethod.POST)
    public @ResponseBody FilmeModel cadastrar(@RequestBody FilmeModel filme){
        return acoes.save(filme);
    }



    @RequestMapping(value="/filme", method = RequestMethod.PUT)
    public @ResponseBody FilmeModel atualizar( @RequestBody FilmeModel filme){
        return acoes.save(filme);
    }



    @DeleteMapping("/filme/{id}")
    public @ResponseBody String deletar(@PathVariable int id){

        try {
            FilmeModel filme = filtrar_por_id(id);
            acoes.delete(filme);
            return "Filme removido com sucesso.";
        }catch (Exception error){
            return "Falha ao remover filme: " + error.getMessage();
        }

    }

}
