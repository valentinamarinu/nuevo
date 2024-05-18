package com.campusConnect.CampusConnect.infrastructure.abstract_services.debiles;

import com.campusConnect.CampusConnect.api.dto.request.debiles.ActividadReq;
import com.campusConnect.CampusConnect.api.dto.response.debiles.ActividadResp;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.CrudService;

public interface IActividadService extends CrudService <ActividadReq, ActividadResp, Long> {
    
}
