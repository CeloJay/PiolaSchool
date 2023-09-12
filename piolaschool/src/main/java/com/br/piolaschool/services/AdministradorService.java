package com.br.piolaschool.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.br.piolaschool.entidade.administrador.Administrador;

import repository.IAdministrador;

@Service
public class AdministradorService {
    
    private IAdministrador repository;

    public AdministradorService (IAdministrador repository){
        this.repository = repository;
    }

    public List<Administrador> listaAdministrador(){
        List<Administrador> lista = (List<Administrador>) repository.findAll();
        return lista;
    }

    public Administrador criarAdministrador(Administrador administrador){
        Administrador administradorNovo = repository.save(administrador);
        return administradorNovo;
    }

    public Administrador editarAdministrador(Administrador administrador){
        Administrador administradorNovo = repository.save(administrador);
        return administradorNovo;
    }

    public Boolean deletarAdministrador(Integer matricula){
        repository.deleteById(matricula);
        return true;
    }
}
