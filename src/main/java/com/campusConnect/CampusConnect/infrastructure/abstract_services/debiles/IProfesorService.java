package com.campusConnect.CampusConnect.infrastructure.abstract_services.debiles;

import com.campusConnect.CampusConnect.api.dto.request.fuertes.UsuarioReq;
import com.campusConnect.CampusConnect.api.dto.response.fuertes.UsuarioResp;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.CrudService;

public interface IProfesorService  extends CrudService<UsuarioReq, UsuarioResp, String>{
    
}
