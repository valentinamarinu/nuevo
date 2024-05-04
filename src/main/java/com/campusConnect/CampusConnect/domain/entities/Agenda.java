package com.campusConnect.CampusConnect.domain.entities;

import java.sql.Date;
import java.sql.Time;

import com.campusConnect.CampusConnect.util.enums.EstadoAgenda;

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

@Entity(name = "agenda")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agenda {
    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgenda;

    @Enumerated(EnumType.STRING)
    private EstadoAgenda estadoAgenda;

    @Column(nullable = false)
    private Date evenStartDate;

    @Column(nullable = false)
    private Date evenEndDate;

    @Column(nullable = false)
    private Time evenStartTime;

    @Column(nullable = false)
    private Time evenEndTime;
    
    @Column(nullable = false)
    private String evenLocation;
    
    @Column(nullable = false)
    private String evenURL;

    /* Relación con tabla Evento */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "evento_id", referencedColumnName = "idEvento")
    private Evento evento;

    /* Relación con tabla Grupo */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grupo_id", referencedColumnName = "idGrupo")
    private Grupo grupo;
}
