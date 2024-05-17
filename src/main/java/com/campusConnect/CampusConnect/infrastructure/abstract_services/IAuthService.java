package com.campusConnect.CampusConnect.infrastructure.abstract_services;

import com.campusConnect.CampusConnect.api.dto.request.security.AdministradorRegisterReq;
import com.campusConnect.CampusConnect.api.dto.request.security.EstudianteRegisterReq;
import com.campusConnect.CampusConnect.api.dto.request.security.LoginReq;
import com.campusConnect.CampusConnect.api.dto.request.security.ProfesorRegisterReq;
import com.campusConnect.CampusConnect.api.dto.request.security.RegisterReq;
import com.campusConnect.CampusConnect.api.dto.response.AuthResp;

public interface IAuthService {
    public AuthResp login(LoginReq request);

    public AuthResp register(RegisterReq request);

    public AuthResp registerAdministrador(AdministradorRegisterReq request);
    
    public AuthResp registerEstudiante(EstudianteRegisterReq request);
    
    public AuthResp registerProfesor(ProfesorRegisterReq request);

}
