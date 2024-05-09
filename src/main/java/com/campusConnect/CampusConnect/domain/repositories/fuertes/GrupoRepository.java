package com.campusConnect.CampusConnect.domain.repositories.fuertes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campusConnect.CampusConnect.domain.entities.fuertes.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {
    
}
