package com.campusConnect.CampusConnect.api.dto.response.intermedias;

import java.util.List;

import com.campusConnect.CampusConnect.api.dto.response.debiles.ActividadResp;
import com.campusConnect.CampusConnect.api.dto.response.debiles.AsignaturaResp;
import com.campusConnect.CampusConnect.api.dto.response.debiles.AsistenciaResp;
import com.campusConnect.CampusConnect.api.dto.response.debiles.ProfesorResp;
import com.campusConnect.CampusConnect.api.dto.response.fuertes.GrupoResp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClaseResp {
    private Long idClase;
    private String horario;
    private String diaSemana;
    private String contenido;
    private List<ActividadResp> actividades;
    private List<AsistenciaResp> asistencias;
    private GrupoResp grupo;
    private AsignaturaResp asignatura;
    private ProfesorResp profesor;
}