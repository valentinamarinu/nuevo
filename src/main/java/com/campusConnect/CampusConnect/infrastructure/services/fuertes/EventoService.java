package com.campusConnect.CampusConnect.infrastructure.services.fuertes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.campusConnect.CampusConnect.api.dto.request.fuertes.EventoReq;
import com.campusConnect.CampusConnect.api.dto.response.fuertes.EventoResp;
import com.campusConnect.CampusConnect.domain.repositories.fuertes.EventoRepository;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.fuertes.IEventoService;
import com.campusConnect.CampusConnect.util.enums.SortType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@Data
@AllArgsConstructor
public class EventoService implements IEventoService {
    @Autowired
    private final EventoRepository eventoRepository;

    @Override
    public Page<EventoResp> getAll(int page, int size, SortType sortType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public EventoResp create(EventoReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public EventoResp update(EventoReq request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public EventoResp getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

}
