
package com.proyecto.proyecto.controller;

import com.proyecto.proyecto.models.Skills;
import com.proyecto.proyecto.services.SkillsService;
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
@RequestMapping("/skills")
public class SkillsController {
    
    private final SkillsService skillsService;
    
    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }
    
    @GetMapping("all")
    public ResponseEntity<List<Skills>> obtenerSkills(){
        List<Skills> skills=skillsService.buscarSkills();
        return new ResponseEntity(skills, HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Skills> editarSkills(@RequestBody Skills skills){
        Skills updateSkills=skillsService.editarSkills(skills);
        return new ResponseEntity(updateSkills, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Skills> agregarSkills(@RequestBody Skills skills){
        Skills addSkills=skillsService.agregarSkills(skills);
        return new ResponseEntity(addSkills, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarSkills(@PathVariable("id") Long id){
        skillsService.borrarSkills(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
