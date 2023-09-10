package com.br.piolaschool.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.piolaschool.entidade.curso.Curso;

import dao.ICurso;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/curso")
public class CursoController {
    
    @Autowired
    private ICurso dao;
    
    @GetMapping
    public List<Curso> listaCurso(){
        return (List<Curso>) dao.findAll();
    }

    @PostMapping
    public Curso criarCurso(@RequestBody Curso curso){
        Curso novoCurso = dao.save(curso);
        return novoCurso;
    }

    @PutMapping
    public Curso editarCurso(@RequestBody Curso curso){
        Curso novoCurso = dao.save(curso);
        return novoCurso;
    }

    @DeleteMapping
    public Optional<Curso> deletarCurso(@PathVariable Integer codigo){
        Optional<Curso> curso = dao.findById(codigo);
        dao.deleteById(codigo); 
        return curso;
    }
}
