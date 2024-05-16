package com.campusConnect.CampusConnect.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusConnect.CampusConnect.api.dto.request.RegisterReq;
import com.campusConnect.CampusConnect.api.dto.response.AuthResp;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.IAuthService;

import lombok.AllArgsConstructor;

@RestController //anotacion de controlador
@RequestMapping //sin ruta
@AllArgsConstructor
public class AuthController {
    
    @Autowired
    private final IAuthService authService;

    //configuracion de rutas publicas
        @PostMapping(path="/auth/login")
        public String login(){
            return "DESDE LOGIN";
        }
        @PostMapping(path="/auth/register")
        public ResponseEntity<AuthResp> register(
            @Validated @RequestBody RegisterReq request
        ){
            return ResponseEntity.ok(this.authService.register(request));
        }
}
