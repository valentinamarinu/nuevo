package com.campusConnect.CampusConnect.infrastructure.abstract_services.debiles;

import com.campusConnect.CampusConnect.api.dto.request.debiles.ProfesorReq;
import com.campusConnect.CampusConnect.api.dto.response.debiles.ProfesorResp;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.CrudService;

public interface IProfesorService extends CrudService <ProfesorReq, ProfesorResp, Long> {
    
}
