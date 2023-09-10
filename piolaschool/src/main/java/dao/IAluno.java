package dao;

import org.springframework.data.repository.CrudRepository;

import com.br.piolaschool.entidade.aluno.Aluno;

public interface IAluno extends CrudRepository<Aluno, Integer>{
    
}
