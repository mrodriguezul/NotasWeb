package dev.mrodriguezul.NotasWeb.services;

import dev.mrodriguezul.NotasWeb.dao.IEtiquetaRepository;
import dev.mrodriguezul.NotasWeb.entity.Etiqueta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtiquetaService implements IEtiquetaService{

    @Autowired
    private IEtiquetaRepository etiquetaRepository;

    @Override
    public List<Etiqueta> findAll() {
        return (List<Etiqueta>) etiquetaRepository.findAll();
    }

    @Override
    public List<Etiqueta> findAllById(List<Long> ids) {
        return (List<Etiqueta>) etiquetaRepository.findAllById(ids);
    }
}
