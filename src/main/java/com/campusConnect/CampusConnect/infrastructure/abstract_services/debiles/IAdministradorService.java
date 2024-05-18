package com.campusConnect.CampusConnect.infrastructure.abstract_services.debiles;

import com.campusConnect.CampusConnect.api.dto.request.debiles.AdministradorReq;
import com.campusConnect.CampusConnect.api.dto.response.debiles.AdministradorResp;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.CrudService;

public interface IAdministradorService extends CrudService <AdministradorReq, AdministradorResp, Long> {
    
}
