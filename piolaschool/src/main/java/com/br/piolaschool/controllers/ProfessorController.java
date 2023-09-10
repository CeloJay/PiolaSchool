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

import com.br.piolaschool.entidade.professor.Professor;

import dao.IProfessor;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    
    @Autowired
    private IProfessor dao; 

    @GetMapping
    public List<Professor> listaProfessor() {
        return(List<Professor>) dao.findAll(); 
    }

    @PostMapping
    public Professor criarProfessor(@RequestBody Professor professor){
        Professor professorNovo = dao.save(professor);
        return professorNovo;
    }

    @PutMapping
    public Professor editarProfessor(@RequestBody Professor professor){
        Professor professorNovo = dao.save(professor);
        return professorNovo;
    }

    @DeleteMapping
    public Optional<Professor> deletarProfessor(@PathVariable Integer matricula){
        Optional<Professor> professor = dao.findById(matricula);
        dao.deleteById(matricula);
        return professor; 
    }
}
