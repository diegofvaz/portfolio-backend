
package com.proyecto.proyecto.models;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_edu;
    private String titulo;
    private String institucion;
    private Date fechaInicio;
    private Date fechaFin;
    
    public Educacion() {}

public Educacion (Long id_edu, String titulo, String institucion, 
        Date fechaInicio, Date fechaFin) {
    
    this.id_edu = id_edu;
    this.titulo = titulo;
    this.institucion = institucion;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
   
    }
}
