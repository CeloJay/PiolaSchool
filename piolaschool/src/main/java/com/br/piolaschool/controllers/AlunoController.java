package com.br.piolaschool.controllers;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.piolaschool.entidade.aluno.Aluno;
import com.br.piolaschool.services.AlunoService;

import repository.IAluno;

@RestController
@RequestMapping("/aluno")
public class AlunoController{

    @Autowired
    private IAluno repository;

    private AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> listaAlunos(){
        return ResponseEntity.status(200).body(alunoService.listaAluno());
    }

    @PostMapping
    public ResponseEntity<Aluno> criarAluno(@RequestBody Aluno aluno){
        return ResponseEntity.status(201).body(alunoService.criarAluno(aluno));
    }

    @PutMapping
    public ResponseEntity<Aluno> editarAluno(@RequestBody Aluno aluno){
        return ResponseEntity.status(200).body(alunoService.editarAluno(aluno));
    }    

    @DeleteMapping("/{matricula}")
    public ResponseEntity<?> deletarAluno(@PathVariable Integer matricula){
        alunoService.deletarAluno(matricula);
        return ResponseEntity.status(204).build();
    }

}
