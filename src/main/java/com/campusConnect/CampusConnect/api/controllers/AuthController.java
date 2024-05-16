package com.campusConnect.CampusConnect.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //anotacion de controlador
@RequestMapping //sin ruta
public class AuthController {
    
    //configuracion de rutas publicas
        @PostMapping(path="/auth/login")
        public String login(){
            return "DESDE LOGIN";
        }
        @PostMapping(path="/auth/register")
        public String register(){
            return "DESDE REGISTER";
        }
}
