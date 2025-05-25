package dev.mrodriguezul.NotasWeb.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "notas")
public class Nota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNota;
    private String titulo;
    private String descripcion;
    @Temporal(TemporalType.DATE)
    private Date fechaNota;
    private Categoria categoria;

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaNota() {
        return fechaNota;
    }

    public void setFechaNota(Date fechaNota) {
        this.fechaNota = fechaNota;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
