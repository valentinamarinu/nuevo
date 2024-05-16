package com.campusConnect.CampusConnect.infrastructure.services;

import org.springframework.stereotype.Service;

import com.campusConnect.CampusConnect.api.dto.request.AdministradorRegisterReq;
import com.campusConnect.CampusConnect.api.dto.request.EstudianteRegisterReq;
import com.campusConnect.CampusConnect.api.dto.request.LoginReq;
import com.campusConnect.CampusConnect.api.dto.request.ProfesorRegisterReq;
import com.campusConnect.CampusConnect.api.dto.request.RegisterReq;
import com.campusConnect.CampusConnect.api.dto.response.AuthResp;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.IAuthService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthService  implements IAuthService{

    @Override
    public AuthResp login(LoginReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public AuthResp register(RegisterReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'register'");
    }

    @Override
    public AuthResp registerAdministrador(AdministradorRegisterReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerAdministrador'");
    }

    @Override
    public AuthResp registerEstudiante(EstudianteRegisterReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerEstudiante'");
    }

    @Override
    public AuthResp registerProfesor(ProfesorRegisterReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerProfesor'");
    }
    
}
