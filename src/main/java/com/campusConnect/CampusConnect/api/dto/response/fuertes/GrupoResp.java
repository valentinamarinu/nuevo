package com.campusConnect.CampusConnect.api.dto.response.fuertes;

import java.util.List;

import com.campusConnect.CampusConnect.api.dto.response.intermedias.AgendaResp;
import com.campusConnect.CampusConnect.api.dto.response.intermedias.ClaseResp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GrupoResp {
    private Long idGrupo;
    private String nombre;
    private List<UEstudianteResp> estudiantes;
    private List<AgendaResp> agendas;
    private List<ClaseResp> clases;
}
