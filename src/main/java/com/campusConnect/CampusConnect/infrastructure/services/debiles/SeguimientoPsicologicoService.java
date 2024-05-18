package com.campusConnect.CampusConnect.infrastructure.services.debiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.campusConnect.CampusConnect.api.dto.request.debiles.SeguimientoPsicologicoReq;
import com.campusConnect.CampusConnect.api.dto.response.debiles.SeguimientoPsicologicoResp;
import com.campusConnect.CampusConnect.domain.repositories.debiles.SeguimientoPsicologicoRepository;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.debiles.ISeguimientoPsicologicoService;
import com.campusConnect.CampusConnect.util.enums.SortType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@Data
@AllArgsConstructor
public class SeguimientoPsicologicoService implements ISeguimientoPsicologicoService{
    @Autowired
    private final SeguimientoPsicologicoRepository seguimientoPsicologicoRepository;

    @Override
    public Page<SeguimientoPsicologicoResp> getAll(int page, int size, SortType sortType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public SeguimientoPsicologicoResp create(SeguimientoPsicologicoReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public SeguimientoPsicologicoResp update(SeguimientoPsicologicoReq request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public SeguimientoPsicologicoResp getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    
}
