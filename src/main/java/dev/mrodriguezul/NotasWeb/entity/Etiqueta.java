package dev.mrodriguezul.NotasWeb.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "etiquetas")
public class Etiqueta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtiqueta;
    private String nombre;
    private String url;
}
