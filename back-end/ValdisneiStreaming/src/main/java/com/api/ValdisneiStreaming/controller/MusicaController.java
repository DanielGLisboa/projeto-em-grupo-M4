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


    @RequestMapping(value = "/musica/{id}" , method=RequestMethod.GET)
    public @ResponseBody MusicaModel filtrar_por_id(@PathVariable int id){
        return acoes.findById(id);
    }


    @RequestMapping(value="/musica", method = RequestMethod.POST)
    public @ResponseBody MusicaModel cadastrar(@RequestBody MusicaModel musica){
        return acoes.save(musica);
    }



    @RequestMapping(value="/musica", method = RequestMethod.PUT)
    public @ResponseBody MusicaModel atualizar( @RequestBody MusicaModel musica){
        return acoes.save(musica);
    }



    @DeleteMapping("/musica/{id}")
    public @ResponseBody String deletar(@PathVariable int id){

        try {
            MusicaModel musica = filtrar_por_id(id);
            acoes.delete(musica);
            return "Musica removida com sucesso.";
        }catch (Exception error){
            return "Falha ao remover musica: " + error.getMessage();
        }

    }

}
