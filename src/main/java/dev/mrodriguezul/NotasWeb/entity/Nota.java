package dev.mrodriguezul.NotasWeb.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "notas")
public class Nota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNota;
    private String titulo;
    private String descripcion;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaNota;
    @OneToOne
    private Categoria categoria;
    @ManyToMany
    private List<Etiqueta> lstEtiquetas;

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

    public List<Etiqueta> getLstEtiquetas() {
        return lstEtiquetas;
    }

    public void setLstEtiquetas(List<Etiqueta> lstEtiquetas) {
        this.lstEtiquetas = lstEtiquetas;
    }
}
