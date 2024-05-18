package com.campusConnect.CampusConnect.infrastructure.services.debiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.campusConnect.CampusConnect.api.dto.request.debiles.ProfesorReq;
import com.campusConnect.CampusConnect.api.dto.response.debiles.ProfesorResp;
import com.campusConnect.CampusConnect.domain.repositories.debiles.ProfesorRepository;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.debiles.IProfesorService;
import com.campusConnect.CampusConnect.util.enums.SortType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@Data
@AllArgsConstructor
public class ProfesorService implements IProfesorService {
    @Autowired
    private final ProfesorRepository profesorRepository;

    @Override
    public Page<ProfesorResp> getAll(int page, int size, SortType sortType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public ProfesorResp create(ProfesorReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ProfesorResp update(ProfesorReq request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public ProfesorResp getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    
}
