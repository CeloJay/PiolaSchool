package repository;

import org.springframework.data.repository.CrudRepository;

import com.br.piolaschool.entidade.administrador.Administrador;

public interface IAdministrador extends CrudRepository<Administrador, Integer> {
    
}
