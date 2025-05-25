package dev.mrodriguezul.NotasWeb.services;

import dev.mrodriguezul.NotasWeb.entity.Etiqueta;

import java.util.List;

public interface IEtiquetaService {
    public List<Etiqueta> findAll();
    public List<Etiqueta> findAllById(List<Long> ids);
}
