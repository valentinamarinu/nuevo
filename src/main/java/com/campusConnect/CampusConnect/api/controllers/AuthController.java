package com.campusConnect.CampusConnect.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusConnect.CampusConnect.api.dto.request.LoginReq;
import com.campusConnect.CampusConnect.api.dto.request.fuertes.UAdministradorReq;
import com.campusConnect.CampusConnect.api.dto.response.AuthResp;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.IAuthService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@RestController //anotacion de controlador
@RequestMapping //sin ruta
@AllArgsConstructor
public class AuthController {
    @Autowired
    private final IAuthService authService;
    
    //configuracion de rutas publicas
    @PostMapping(path="/auth/login")
    public ResponseEntity<AuthResp> login(@Validated @RequestBody LoginReq request){
        return ResponseEntity.ok(this.authService.login(request));
    }

    @PostMapping(path="/auth/registro/administracion")
    public ResponseEntity<AuthResp> registerAdministrador(@Validated @RequestBody UAdministradorReq request){
        return ResponseEntity.ok(this.authService.registerAdministrador(request));
    }
}
