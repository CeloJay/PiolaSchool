package com.br.piolaschool.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.br.piolaschool.entidade.professor.Professor;

import repository.IProfessor;

@Service
public class ProfessorService {
    
    private IProfessor repository;

    public ProfessorService(IProfessor repository){
        this.repository = repository;
    }

    public List<Professor> listaProfessor(){
        List<Professor> lista = (List<Professor>) repository.findAll();
        return lista;
    }

    public Professor criarProfessor(Professor professor){
        Professor professorNovo = repository.save(professor);
        return professorNovo;
    }

    public Professor editarProfessor(Professor professor){
        Professor professorNovo = repository.save(professor);
        return professorNovo;
    }

    public Boolean deletarProfessor(Integer matricula){
        repository.deleteById(matricula);
        return true;
    }
}
