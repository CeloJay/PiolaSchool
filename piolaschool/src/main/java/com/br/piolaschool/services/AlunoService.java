package com.br.piolaschool.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.br.piolaschool.entidade.aluno.Aluno;

import repository.IAluno;

@Service
public class AlunoService {
    
    private IAluno repository;

    public AlunoService (IAluno repository){
        this.repository = repository;
    }

    public List<Aluno> listaAluno(){
        List<Aluno> lista = (List<Aluno>) repository.findAll();
        return lista;
    }

    public Aluno criarAluno(Aluno aluno){
        Aluno alunoNovo = repository.save(aluno);
        return alunoNovo;
    }

    public Aluno editarAluno(Aluno aluno){
        Aluno alunoNovo = repository.save(aluno);
        return alunoNovo;
    }

    public Boolean deletarAluno(Integer matricula){
        repository.deleteById(matricula);
        return true;
    }

}
