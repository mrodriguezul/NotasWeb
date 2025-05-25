package dev.mrodriguezul.NotasWeb.dao;


import dev.mrodriguezul.NotasWeb.entity.Nota;
import org.springframework.data.repository.CrudRepository;

public interface INotaRepository extends CrudRepository<Nota, Integer> {

}
