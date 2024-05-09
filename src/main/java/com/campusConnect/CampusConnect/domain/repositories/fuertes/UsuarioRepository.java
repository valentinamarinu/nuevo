package com.campusConnect.CampusConnect.domain.repositories.fuertes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campusConnect.CampusConnect.domain.entities.fuertes.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    
}
