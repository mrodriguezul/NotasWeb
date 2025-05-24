package dev.mrodriguezul.NotasWeb.services;

import dev.mrodriguezul.NotasWeb.bean.NotaBean;

import java.util.List;

public interface INotasService {
    public List<NotaBean> getNotasByUser(String usuario);
}
