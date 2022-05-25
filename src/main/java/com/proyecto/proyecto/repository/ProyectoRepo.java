package com.proyecto.proyecto.repository;

import com.proyecto.proyecto.models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProyectoRepo extends JpaRepository<Proyecto, Long> {
    
}
