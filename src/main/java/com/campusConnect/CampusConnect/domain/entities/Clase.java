package com.campusConnect.CampusConnect.domain.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "clase")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clase {
    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClase;

    @Column(nullable = false)
    private String diaSemana;

    @Column(nullable = false)
    private String contenido;

    /* Relación con tabla Asignatura */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asignatura_id", referencedColumnName = "idAsignatura")
    private Asignatura asignatura;

    /* Relación con tabla Actividad */
    @OneToMany(mappedBy = "clase", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Actividad> actividades;

    /* Relación con tabla Asistencia */
    @OneToMany(mappedBy = "clase", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Asistencia> asistencias;

    /* Relación con tabla Grupo */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grupo_id", referencedColumnName = "idGrupo")
    private Grupo grupo;

    /* Relación con tabla Grupo */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profesor_id", referencedColumnName = "idProfesor")
    private Profesor profesor;
}
