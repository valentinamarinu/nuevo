package com.campusConnect.CampusConnect.domain.entities.debiles;

import java.util.Date;

import com.campusConnect.CampusConnect.domain.entities.intermedias.Clase;
import com.campusConnect.CampusConnect.util.enums.EstadoAsistencia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "asistencia")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asistencia {
    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsistencia;

    @Column(nullable = false)
    private Date dia;

    @Enumerated(EnumType.STRING)
    private EstadoAsistencia asistencia;

    /* Relación con la tabla Clases */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clase_id", referencedColumnName = "idClase")
    private Clase claseId;
}
