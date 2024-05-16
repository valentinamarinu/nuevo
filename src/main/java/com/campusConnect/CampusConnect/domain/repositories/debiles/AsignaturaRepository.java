package com.campusConnect.CampusConnect.domain.repositories.debiles;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.campusConnect.CampusConnect.domain.entities.debiles.Asignatura;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> { 

    // @Query(value = "SELECT  a FROM asignatura a WHERE a.nombre :name")
    // public List<Asignatura> findByName(String name);
}
