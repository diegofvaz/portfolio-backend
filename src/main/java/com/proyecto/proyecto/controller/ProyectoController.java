
package com.proyecto.proyecto.controller;

import com.proyecto.proyecto.models.Proyecto;
import com.proyecto.proyecto.services.ProyectoService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
    
    private final ProyectoService proyectoService;
    
    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }
    
    @GetMapping("all")
    public ResponseEntity<List<Proyecto>> obtenerProyecto(){
        List<Proyecto> proyecto=proyectoService.buscarProyecto();
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Proyecto> editarProyecto(@RequestBody Proyecto proyecto){
        Proyecto updateProyecto=proyectoService.editarProyecto(proyecto);
        return new ResponseEntity(updateProyecto, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Proyecto> agregarProyecto(@RequestBody Proyecto proyecto){
        Proyecto addProyecto=proyectoService.agregarProyecto(proyecto);
        return new ResponseEntity(addProyecto, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarProyecto(@PathVariable("id") Long id){
        proyectoService.borrarProyecto(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
