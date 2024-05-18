package com.campusConnect.CampusConnect.infrastructure.services.debiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.campusConnect.CampusConnect.api.dto.request.debiles.AdministradorReq;
import com.campusConnect.CampusConnect.api.dto.response.debiles.AdministradorResp;
import com.campusConnect.CampusConnect.domain.repositories.debiles.AdministradorRepository;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.debiles.IAdministradorService;
import com.campusConnect.CampusConnect.util.enums.SortType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@Data
@AllArgsConstructor
public class AdministradorService implements IAdministradorService {
    @Autowired
    private final AdministradorRepository administradorRepository;

    @Override
    public Page<AdministradorResp> getAll(int page, int size, SortType sortType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public AdministradorResp create(AdministradorReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public AdministradorResp update(AdministradorReq request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public AdministradorResp getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    
}
