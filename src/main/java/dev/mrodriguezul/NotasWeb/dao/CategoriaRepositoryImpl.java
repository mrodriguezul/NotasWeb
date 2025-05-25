package dev.mrodriguezul.NotasWeb.dao;

import dev.mrodriguezul.NotasWeb.entity.Categoria;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class CategoriaRepositoryImpl implements ICategoriaManual{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void save(Categoria categoria) {
        em.persist(categoria);
    }

    @Override
    @Transactional
    public Categoria findById(int id) {
        return em.find(Categoria.class, id);
    }
}
