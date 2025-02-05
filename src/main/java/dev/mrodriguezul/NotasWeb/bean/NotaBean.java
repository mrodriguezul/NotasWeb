package dev.mrodriguezul.NotasWeb.bean;

import java.io.Serializable;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author Lenovo
 */
@Data
@RequiredArgsConstructor
public class NotaBean implements Serializable{
    @NonNull
    private Integer id;
    @NonNull
    private String nombre;
    @NonNull
    private String descripcion;
}
