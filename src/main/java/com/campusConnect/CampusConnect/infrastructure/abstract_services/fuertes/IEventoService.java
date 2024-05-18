package com.campusConnect.CampusConnect.infrastructure.abstract_services.fuertes;

import com.campusConnect.CampusConnect.api.dto.request.fuertes.EventoReq;
import com.campusConnect.CampusConnect.api.dto.response.fuertes.EventoResp;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.CrudService;

public interface IEventoService extends CrudService <EventoReq, EventoResp, Long> {
    
}
