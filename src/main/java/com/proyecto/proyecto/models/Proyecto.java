
package com.proyecto.proyecto.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String nombre;
   private String descripcion;
   private String img;
   private String url;
   
public Proyecto() {}

public Proyecto (Long id, String nombre, String descripcion, 
        String img, String url) {
    
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.img = img;
    this.url = url;
   
    }
}
