package dev.mrodriguezul.NotasWeb.services;

import dev.mrodriguezul.NotasWeb.entity.Nota;

import java.util.List;

public interface INotaService {
    public void save(Nota nota);
    public Nota findById(int id);
    public void delete(int id);
    public List<Nota> findAll();
}
