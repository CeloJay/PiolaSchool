package com.br.piolaschool.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.piolaschool.entidade.administrador.Administrador;

import dao.IAdministrador;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {
    
    @Autowired
    private IAdministrador dao;
    
    @GetMapping
    public List<Administrador> listaAdministrador() {
        return(List<Administrador>) dao.findAll();
    }

    @PostMapping
    public Administrador criarAdministrador(@RequestBody Administrador administrador){
        Administrador novoAdministrador = dao.save(administrador);
        return novoAdministrador;
    }

    @PutMapping
    public Administrador editarAdministrador(@RequestBody Administrador administrador){
        Administrador novoAdministrador = dao.save(administrador);
        return novoAdministrador;
    }

    @DeleteMapping
    public Optional<Administrador> deletarAdministrador(@PathVariable Integer matricula){
        Optional<Administrador> administrador = dao.findById(matricula);
        dao.deleteById(matricula);
        return administrador;
    }
}
