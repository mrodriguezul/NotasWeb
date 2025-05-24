package dev.mrodriguezul.NotasWeb.services;

import dev.mrodriguezul.NotasWeb.bean.NotaBean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("notasFree")
@Primary //para hacer que sea el servicio primario (usado cuando existan más de una implementación)
public class NotasService implements INotasService {

    public List<NotaBean> getNotasByUser(String usuario){
        List<NotaBean> lstNotas = new ArrayList<>();
        lstNotas.add(new NotaBean(1, "Test1", "Descripción 1"));
        lstNotas.add(new NotaBean(2, "Test2", "Descripción 2"));
        lstNotas.add(new NotaBean(3, "Test3", "Descripción 3"));
        lstNotas.add(new NotaBean(4, "Test4", "Descripción 4"));
        lstNotas.add(new NotaBean(5, "Test5", "Descripción 5"));
        lstNotas.add(new NotaBean(6, "Test6", "Descripción 6"));

        return lstNotas;
    }
}
