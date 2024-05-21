package com.campusConnect.CampusConnect.infrastructure.services.fuertes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.campusConnect.CampusConnect.api.dto.request.fuertes.UProfesorReq;
import com.campusConnect.CampusConnect.api.dto.response.fuertes.UProfesorResp;
import com.campusConnect.CampusConnect.domain.repositories.debiles.ProfesorRepository;
import com.campusConnect.CampusConnect.domain.repositories.fuertes.UsuarioRepository;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.fuertes.IProfesorService;
import com.campusConnect.CampusConnect.util.enums.SortType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@Data
@AllArgsConstructor
public class ProfesorService implements IProfesorService {
    @Autowired
    private final UsuarioRepository usuarioRepository;

    @Autowired
    private final ProfesorRepository profesorRepository;

    @Override
    public Page<UProfesorResp> getAll(int page, int size, SortType sortType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public UProfesorResp create(UProfesorReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public UProfesorResp update(UProfesorReq request, String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public UProfesorResp getById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

}
