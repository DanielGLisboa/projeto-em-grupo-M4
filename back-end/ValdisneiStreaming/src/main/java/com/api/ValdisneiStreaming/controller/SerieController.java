package com.api.ValdisneiStreaming.controller;

import com.api.ValdisneiStreaming.model.SerieModel;
import com.api.ValdisneiStreaming.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apivaldisnei")
public class SerieController {

    @Autowired
    private SerieRepository acoes;

    @GetMapping("/serie")
    public  @ResponseBody List<SerieModel> get(){
        return acoes.findAll();
    }

    @RequestMapping(value = "/serie/{id}" , method= RequestMethod.GET)
    public @ResponseBody SerieModel filtrar_por_id(@PathVariable int id){
        return acoes.findById(id);
    }


    @RequestMapping(value="/serie", method = RequestMethod.POST)
    public @ResponseBody SerieModel cadastrar(@RequestBody SerieModel serie){
        return acoes.save(serie);
    }


    @RequestMapping(value="/serie", method = RequestMethod.PUT)
    public @ResponseBody SerieModel atualizar( @RequestBody SerieModel serie){
        return acoes.save(serie);
    }


    @DeleteMapping("/serie/{id}")
    public @ResponseBody String deletar(@PathVariable int id){

        try {
            SerieModel serie = filtrar_por_id(id);
            acoes.delete(serie);
            return "Serie removida com sucesso.";
        }catch (Exception error){
            return "Falha ao remover serie: " + error.getMessage();
        }

    }

}
