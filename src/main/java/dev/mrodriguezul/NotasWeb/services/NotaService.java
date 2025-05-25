package dev.mrodriguezul.NotasWeb.services;

import dev.mrodriguezul.NotasWeb.dao.INotaRepository;
import dev.mrodriguezul.NotasWeb.entity.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaService implements INotaService {

    @Autowired
    private INotaRepository repository;

    @Override
    public void save(Nota nota) {
        repository.save(nota);
    }

    @Override
    public Nota findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<Nota> findAll() {
        return (List<Nota>) repository.findAll();
    }
}
