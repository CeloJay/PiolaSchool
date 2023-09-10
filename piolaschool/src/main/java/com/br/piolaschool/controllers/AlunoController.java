package com.br.piolaschool.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.piolaschool.entidade.aluno.Aluno;

import dao.IAluno;

@RestController
@RequestMapping("/aluno")
public class AlunoController{

    @Autowired
    private IAluno dao;

    @GetMapping
    public List<Aluno> listaAlunos (){
        return(List<Aluno>) dao.findAll();
    }

    @PostMapping
    public Aluno criarAluno(@RequestBody Aluno aluno){
        Aluno alunoNovo = dao.save(aluno);
        return alunoNovo;
    }

    @PutMapping
    public Aluno editarAluno(@RequestBody Aluno aluno){
        Aluno alunoNovo = dao.save(aluno);
        return alunoNovo;
    }    

    @DeleteMapping("/{matricula}")
    public Optional<Aluno> deletarAluno(@PathVariable Integer matricula){
        Optional<Aluno> aluno = dao.findById(matricula);
        dao.deleteById(matricula);
        return aluno;
    }

}
