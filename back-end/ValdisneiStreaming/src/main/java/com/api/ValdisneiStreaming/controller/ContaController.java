package com.api.ValdisneiStreaming.controller;

import com.api.ValdisneiStreaming.model.ContaModel;
import com.api.ValdisneiStreaming.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apivaldisnei")
public class ContaController {
    @Autowired
    private ContaRepository acoes;

    //Listar
    @RequestMapping(value="/conta", method = RequestMethod.GET)
    public @ResponseBody List<ContaModel> listar(){
        return acoes.findAll();
    }

    //Filtrar por usuario
    @RequestMapping(value="/conta/{usuario}", method = RequestMethod.GET)
    public @ResponseBody ContaModel filtrar(@PathVariable Integer usuario){
        return acoes.findByUsuario(usuario);
    }

    //Remover
    @RequestMapping(value="/conta/{codigo}", method = RequestMethod.DELETE)
    public @ResponseBody void remover(@PathVariable Integer codigo){
        ContaModel usuario = filtrar(codigo);

        this.acoes.delete(usuario);
    }

    //Cadastrar
    @RequestMapping(value="/conta", method = RequestMethod.POST)
    public @ResponseBody ContaModel cadastrar(@RequestBody ContaModel usuario) {
        return acoes.save(usuario);
    }

    //Alterar
    @RequestMapping(value="/conta", method = RequestMethod.PUT)
    public @ResponseBody ContaModel alterar(@RequestBody ContaModel usuario) {
        return acoes.save(usuario);

    }


}
