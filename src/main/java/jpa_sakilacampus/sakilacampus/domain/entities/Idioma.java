package jpa_sakilacampus.sakilacampus.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "idioma")
public class Idioma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_idioma;

    @Column (columnDefinition = "VARCHAR(20)", nullable = false)
    private String nombre;

    @Column (columnDefinition = "TIMESTAMP", nullable = false)
    private Integer ultima_actualizacion;

    public Integer getId_idioma() {
        return id_idioma;
    }

    public void setId_idioma(Integer id_idioma) {
        this.id_idioma = id_idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(Integer ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

    

}
