package dao;

import org.springframework.data.repository.CrudRepository;

import com.br.piolaschool.entidade.curso.Curso;

public interface ICurso extends CrudRepository<Curso, Integer>{
    
}
