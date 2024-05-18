package com.campusConnect.CampusConnect.api.dto.response.debiles;

import java.util.List;

import com.campusConnect.CampusConnect.api.dto.response.fuertes.GrupoResp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteResp {
    private String acudientes;
    private List<SeguimientoPsicologicoResp> seguimientosPsicologicos;
    private List<AsistenciaResp> asistencias;
    private GrupoResp grupo; 
}
