package repository;

import org.springframework.data.repository.CrudRepository;

import com.br.piolaschool.entidade.professor.Professor;

public interface IProfessor extends CrudRepository<Professor, Integer> {

    Object listaProfessor();
    
    
}
