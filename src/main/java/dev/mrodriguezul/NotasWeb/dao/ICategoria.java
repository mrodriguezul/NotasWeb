package dev.mrodriguezul.NotasWeb.dao;

import dev.mrodriguezul.NotasWeb.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface ICategoria extends CrudRepository<Categoria, Integer> {

}
