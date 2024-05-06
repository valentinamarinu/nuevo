package com.campusConnect.CampusConnect.domain.entities.debiles;

import java.util.List;

import com.campusConnect.CampusConnect.domain.entities.intermedias.Clase;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "profesor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profesor {
    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfesor;

    @Column(nullable = false)
    private String hojaVida;

    /* Relación con tabla Clase */
    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Clase> clases;

}


