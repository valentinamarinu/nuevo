package com.campusConnect.CampusConnect.api.dto.response.intermedias;

import java.util.List;

import com.campusConnect.CampusConnect.api.dto.response.debiles.ActividadResp;
import com.campusConnect.CampusConnect.api.dto.response.debiles.AsignaturaResp;
import com.campusConnect.CampusConnect.api.dto.response.fuertes.GrupoResp;
import com.campusConnect.CampusConnect.api.dto.response.fuertes.UProfesorResp;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClaseToProfesorResp {
    private Long idClase;
    private String horario;
    private String diaSemana;
    private String contenido;
    private List<ActividadResp> actividades;
    private List<AsistenciaResp> asistencias;
    private GrupoResp grupo;
    private AsignaturaResp asignatura;
    private UProfesorResp profesor;
}
