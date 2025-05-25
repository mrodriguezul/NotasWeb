package dev.mrodriguezul.NotasWeb.services;

import dev.mrodriguezul.NotasWeb.entity.Categoria;

import java.util.List;

public interface ICategoriaService {
    public void save(Categoria categoria);
    public Categoria findById(int id);
    public void delete(int id);
    public List<Categoria> findAll();
}
