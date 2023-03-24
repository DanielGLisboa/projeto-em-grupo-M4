package com.api.ValdisneiStreaming.controller;

import com.api.ValdisneiStreaming.model.AtorModel;
import com.api.ValdisneiStreaming.repository.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apivaldisnei")
public class AtorController {
    @Autowired
    private AtorRepository acoes;
    @RequestMapping(value = "/ator", method = RequestMethod.GET)
    public @ResponseBody List<AtorModel> listar() {return acoes.findAll();}

    @RequestMapping(value="/ator",method = RequestMethod.POST)
    public @ResponseBody AtorModel cadastrar(@RequestBody AtorModel nome){
        return acoes.save(nome);
    }

    @RequestMapping(value="/ator",method = RequestMethod.PUT)
    public @ResponseBody AtorModel alterar(@RequestBody AtorModel nome){
        return acoes.save(nome);
    }

    @RequestMapping(value = "/ator/{id}", method =RequestMethod.GET )
    public @ResponseBody AtorModel filtrar(@PathVariable int id){
        return acoes.findById(id);
    }

    @DeleteMapping("/ator/{id}")
    public @ResponseBody String deletar(@PathVariable int id){

        try {
            AtorModel ator = filtrar(id);
            acoes.delete(ator);
            return "Ator removido com sucesso.";
        }catch (Exception error){
            return "Falha ao remover ator: " + error.getMessage();
        }

    }
}
