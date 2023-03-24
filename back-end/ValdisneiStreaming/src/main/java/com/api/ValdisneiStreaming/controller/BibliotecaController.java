package com.api.ValdisneiStreaming.controller;

import com.api.ValdisneiStreaming.model.BibliotecaModel;
import com.api.ValdisneiStreaming.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apivaldisnei")
public class BibliotecaController {
    @Autowired
    private BibliotecaRepository acoes;

    //Listar
    @RequestMapping(value="/biblioteca", method = RequestMethod.GET)
    public @ResponseBody List<BibliotecaModel> listar(){
        return acoes.findAll();
    }

    //Filtrar por usuario
//    @RequestMapping(value="/biblioteca/{id}", method = RequestMethod.GET)
//    public @ResponseBody BibliotecaModel filtrar(@PathVariable int id){
//        return acoes.findById(id);
//    }
//
//    //Remover
//    @RequestMapping(value="/biblioteca/{codigo}", method = RequestMethod.DELETE)
//    public @ResponseBody void remover(@PathVariable Integer codigo){
//        BibliotecaModel usuario = filtrar(codigo);
//
//        this.acoes.delete(usuario);
//    }

    //Cadastrar
    @RequestMapping(value="/biblioteca", method = RequestMethod.POST)
    public @ResponseBody BibliotecaModel cadastrar(@RequestBody BibliotecaModel biblioteca) {
     return acoes.save(biblioteca);
    }

    //Alterar
    @RequestMapping(value="/biblioteca", method = RequestMethod.PUT)
    public @ResponseBody BibliotecaModel alterar(@RequestBody BibliotecaModel biblioteca) {
        return acoes.save(biblioteca);

    }

    @DeleteMapping("/biblioteca/{id}")
    public @ResponseBody String deletar(@PathVariable int id){
        try{
            BibliotecaModel biblioteca = acoes.findById(id);
            acoes.delete(biblioteca);
            return  "Biblioteca removida com sucesso.";
        } catch (Exception error){
            return "Falha ao remover playlist" + error.getMessage();
        }
    }
}