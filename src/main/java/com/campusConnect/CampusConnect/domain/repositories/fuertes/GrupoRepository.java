package com.campusConnect.CampusConnect.domain.repositories.fuertes;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.campusConnect.CampusConnect.domain.entities.fuertes.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {
    
    //  @Query(value = "SELECT  g FROM grupo g WHERE g.nombre :name")
    // public List<Grupo> findByname(String name);
    
}
