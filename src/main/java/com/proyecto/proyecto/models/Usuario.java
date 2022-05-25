package com.proyecto.proyecto.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(nullable = false, updatable = false)
private Long id;
private String nombre;
private String apellido;
private String titulo;
private String descripcion;
private String fotoPerfil;

@OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
private List<Experiencia> experienciaList;

@OneToMany(fetch = FetchType.LAZY, mappedBy = "id_edu")
private List<Educacion> educacionList;

@OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
private List<Skills> skillsList;

@OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
private List<Proyecto> proyectoList;

public Usuario(){}

public Usuario (Long id, String nombre, String apellido, String titulo,
                String descripcion, String fotoPerfil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fotoPerfil = fotoPerfil;
     }

}
