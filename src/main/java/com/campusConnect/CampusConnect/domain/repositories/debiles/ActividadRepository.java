package com.campusConnect.CampusConnect.domain.repositories.debiles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campusConnect.CampusConnect.domain.entities.debiles.Actividad;

@Repository
public interface ActividadRepository extends JpaRepository<Actividad, Long> {
    
}
