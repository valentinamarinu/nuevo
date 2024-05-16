package com.campusConnect.CampusConnect.infrastructure.services.debiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.campusConnect.CampusConnect.api.dto.request.fuertes.UsuarioReq;
import com.campusConnect.CampusConnect.api.dto.response.fuertes.UsuarioResp;
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
    public Page<UsuarioResp> getAll(int page, int size, SortType sortType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public UsuarioResp create(UsuarioReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public UsuarioResp update(UsuarioReq request, String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public UsuarioResp getById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

}
