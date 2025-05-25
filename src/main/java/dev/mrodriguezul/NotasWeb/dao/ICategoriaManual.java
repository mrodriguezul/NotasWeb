package dev.mrodriguezul.NotasWeb.dao;

import dev.mrodriguezul.NotasWeb.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface ICategoriaManual {
    public void save(Categoria categoria);
    public Categoria findById(int id);
}
