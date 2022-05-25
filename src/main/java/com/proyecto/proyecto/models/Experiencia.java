
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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String puesto;
    private String empresa;
    private String lugar;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;  

public Experiencia() {}

public Experiencia(Long id, String puesto, String empresa, 
String lugar, Date fechaInicio, Date fechaFin, String descripcion) {
    
    this.id = id;
    this.puesto = puesto;
    this.empresa = empresa;
    this.lugar = lugar;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.descripcion = descripcion;
   
    }

}