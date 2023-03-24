package com.api.ValdisneiStreaming.controller;

import com.api.ValdisneiStreaming.model.MusicoModel;
import com.api.ValdisneiStreaming.repository.MusicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apivaldisnei")
public class MusicoController {
    @Autowired
    private MusicoRepository acoes;
    @RequestMapping(value = "/musico", method = RequestMethod.GET)
    public @ResponseBody List<MusicoModel> listar() {return acoes.findAll();}

    @RequestMapping(value="/musico",method = RequestMethod.POST)
    public @ResponseBody MusicoModel cadastrar(@RequestBody MusicoModel nome){
        return acoes.save(nome);
    }

    @RequestMapping(value="/musico",method = RequestMethod.PUT)
    public @ResponseBody MusicoModel alterar(@RequestBody MusicoModel nome){
        return acoes.save(nome);
    }

    @RequestMapping(value = "/musico/{id}", method =RequestMethod.GET )
    public @ResponseBody MusicoModel filtrar(@PathVariable int id){
        return acoes.findById(id);
    }

    @DeleteMapping("/musico/{id}")
    public @ResponseBody String deletar(@PathVariable int id){

        try {
            MusicoModel musico = filtrar(id);
            acoes.delete(musico);
            return "Musico removido com sucesso.";
        }catch (Exception error){
            return "Falha ao remover musico: " + error.getMessage();
        }

    }
}

