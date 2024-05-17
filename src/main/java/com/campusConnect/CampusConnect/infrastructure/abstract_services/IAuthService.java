package com.campusConnect.CampusConnect.infrastructure.abstract_services;

import com.campusConnect.CampusConnect.api.dto.request.EstudianteRegisterReq;
import com.campusConnect.CampusConnect.api.dto.request.LoginReq;
import com.campusConnect.CampusConnect.api.dto.request.ProfesorRegisterReq;
import com.campusConnect.CampusConnect.api.dto.request.RegisterReq;
import com.campusConnect.CampusConnect.api.dto.response.AuthResp;

public interface IAuthService {

    public AuthResp login(LoginReq request);

    public AuthResp register(RegisterReq request);

    public AuthResp registerEstudiante( EstudianteRegisterReq request);
    public AuthResp registerProfesor(ProfesorRegisterReq request);

}
