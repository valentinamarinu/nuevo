package com.campusConnect.CampusConnect.domain.repositories.fuertes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.campusConnect.CampusConnect.domain.entities.fuertes.Grupo;
import com.campusConnect.CampusConnect.domain.entities.fuertes.Usuario;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {
    @Query(value = "SELECT u FROM usuario u WHERE u.nombre = :nombre AND u.apellido = :apellido")
    public Usuario findByNombreAndApellido(String nombre, String apellido);
}
