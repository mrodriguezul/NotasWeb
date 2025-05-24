package dev.mrodriguezul.NotasWeb.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class CategoriaBean implements Serializable {
    @NonNull
    private int idCategoria;
    @NonNull
    private String nombre;
}
