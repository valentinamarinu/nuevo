package com.campusConnect.CampusConnect.domain.entities.debiles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "administrador")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Administrador {
    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdministrador;
    
    @Column(nullable = false)
    private String descripcionCargo;
}
