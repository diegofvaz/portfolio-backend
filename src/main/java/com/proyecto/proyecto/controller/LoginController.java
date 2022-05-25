
package com.proyecto.proyecto.controller;

import com.proyecto.proyecto.models.Login;
import com.proyecto.proyecto.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
public class LoginController {
    @Autowired
    LoginService loginService;
    
    @PostMapping("/login")
    public boolean login(@RequestBody Login login) {
        return loginService.isUserEnabled(login);
    }
}
