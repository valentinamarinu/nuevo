package com.campusConnect.CampusConnect.infrastructure.abstract_services.intermedias;

import com.campusConnect.CampusConnect.api.dto.request.intermedias.AgendaReq;
import com.campusConnect.CampusConnect.api.dto.response.intermedias.AgendaResp;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.CrudService;

public interface IAgendaService extends CrudService <AgendaReq, AgendaResp, Long> {
    
}
