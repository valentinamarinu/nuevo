package com.campusConnect.CampusConnect.infrastructure.abstract_services.fuertes;

import com.campusConnect.CampusConnect.api.dto.request.fuertes.UsuarioReq;
import com.campusConnect.CampusConnect.api.dto.response.fuertes.UsuarioResp;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.CrudService;

public interface IEventoService extends CrudService<UsuarioReq, UsuarioResp, String> {
    
}
