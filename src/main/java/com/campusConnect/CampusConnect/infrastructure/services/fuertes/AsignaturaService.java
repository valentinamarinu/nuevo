package com.campusConnect.CampusConnect.infrastructure.services.fuertes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.campusConnect.CampusConnect.api.dto.request.debiles.AsignaturaReq;
import com.campusConnect.CampusConnect.api.dto.response.debiles.AsignaturaResp;
import com.campusConnect.CampusConnect.domain.repositories.debiles.AsignaturaRepository;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.fuertes.IAsignaturaService;
import com.campusConnect.CampusConnect.util.enums.SortType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@Data
@AllArgsConstructor
public class AsignaturaService implements IAsignaturaService {
    @Autowired
    private final AsignaturaRepository asignaturaRepository;

    @Override
    public Page<AsignaturaResp> getAll(int page, int size, SortType sortType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public AsignaturaResp create(AsignaturaReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public AsignaturaResp update(AsignaturaReq request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public AsignaturaResp getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

}
