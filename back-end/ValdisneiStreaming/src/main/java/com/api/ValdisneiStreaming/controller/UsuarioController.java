package com.api.Valdisnei.controller;

import com.api.Valdisnei.model.UsuarioModel;
import com.api.Valdisnei.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apivaldisnei")
public class UsuarioController {
    @Autowired
    private UsuarioRepository acoes;

    //Listar
    @RequestMapping(value="/usuario", method = RequestMethod.GET)
    public @ResponseBody List<UsuarioModel> listar(){
        return acoes.findAll();
    }

    //Filtrar por usuario
    @RequestMapping(value="/usuario/{email}", method = RequestMethod.GET)
    public @ResponseBody UsuarioModel filtrar(@PathVariable String email){
        return acoes.findByEmail(email);
    }

    //Remover
    @RequestMapping(value="/usuario/{codigo}", method = RequestMethod.DELETE)
    public @ResponseBody void remover(@PathVariable String codigo){
        UsuarioModel email = filtrar(codigo);

        this.acoes.delete(email);
    }

    //Cadastrar
    @RequestMapping(value="/usuario", method = RequestMethod.POST)
    public @ResponseBody UsuarioModel cadastrar(@RequestBody UsuarioModel email) {
        return acoes.save(email);
    }

    //Alterar
    @RequestMapping(value="/usuario", method = RequestMethod.PUT)
    public @ResponseBody UsuarioModel alterar(@RequestBody UsuarioModel email) {
        return acoes.save(email);

    }

}
