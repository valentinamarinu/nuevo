package com.campusConnect.CampusConnect.domain.repositories.debiles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campusConnect.CampusConnect.domain.entities.debiles.Administrador;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long>{
    
}
