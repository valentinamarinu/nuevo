package com.campusConnect.CampusConnect.domain.entities;

import com.campusConnect.CampusConnect.util.enums.EstadoAnimo;

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

@Entity(name = "seguimientoPsicologico")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeguimientoPsicologico {
    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSeguimientoPsicologico;

    @Enumerated(EnumType.STRING)
    private EstadoAnimo estadoAnimo;
   
    /* Relación con la tabla Estudiante */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id", referencedColumnName = "idUsuario")
    private Estudiante estudiante;
}
