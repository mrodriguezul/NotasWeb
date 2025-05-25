package dev.mrodriguezul.NotasWeb.services;

import dev.mrodriguezul.NotasWeb.dao.ICategoria;
import dev.mrodriguezul.NotasWeb.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService implements ICategoriaService{
    @Autowired
    private ICategoria categoriaRepository;
    @Override
    public void save(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public Categoria findById(int id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        categoriaRepository.deleteById(id);
    }

    @Override
    public List<Categoria> findAll() {
        return (List<Categoria>) categoriaRepository.findAll();
    }
}
