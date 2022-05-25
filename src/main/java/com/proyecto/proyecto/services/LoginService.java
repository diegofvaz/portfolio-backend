
package com.proyecto.proyecto.services;

import com.proyecto.proyecto.models.Login;
import com.proyecto.proyecto.repository.LoginRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class LoginService {
    @Autowired
    private LoginRepo loginRepo;
    
    public boolean isUserEnabled(Login login) {
        boolean isUserEnabled = false;
        List<Login> usuarios = loginRepo.findByNombre(login.getNombre());
        if (!usuarios.isEmpty()) {
            Login usuario = usuarios.get(0);
            if (usuario.getPassword().equals(login.getPassword())){
                isUserEnabled = true;
            }
        }
        return isUserEnabled;
    }
    
}
