
package com.proyecto.proyecto.services;

import com.proyecto.proyecto.models.Educacion;
import com.proyecto.proyecto.repository.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {
    
    private final EducacionRepo educacionRepo;
    
    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }
    
    public Educacion agregarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    
    public List<Educacion> buscarEducacion(){
        return educacionRepo.findAll();
    }
    
    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    
    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    } 
}