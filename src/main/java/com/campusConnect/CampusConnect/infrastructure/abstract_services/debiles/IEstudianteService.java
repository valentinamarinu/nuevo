package com.campusConnect.CampusConnect.infrastructure.abstract_services.debiles;

import com.campusConnect.CampusConnect.api.dto.request.debiles.EstudianteReq;
import com.campusConnect.CampusConnect.api.dto.response.debiles.EstudianteResp;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.CrudService;

public interface IEstudianteService extends CrudService <EstudianteReq, EstudianteResp, Long> {
    
}
