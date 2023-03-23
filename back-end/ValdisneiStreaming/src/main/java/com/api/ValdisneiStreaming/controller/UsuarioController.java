package com.api.ValdisneiStreaming.controller;

import com.api.ValdisneiStreaming.model.UsuarioModel;
import com.api.ValdisneiStreaming.repository.UsuarioRepository;
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
    @DeleteMapping("/usuario/{email}")
    public @ResponseBody String deletar(@PathVariable String email){

        try {
            UsuarioModel usuario = filtrar(email);
            acoes.delete(usuario);
            return "Usuario removido com sucesso.";
        }catch (Exception error){
            return "Falha ao remover usuario: " + error.getMessage();
        }

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
