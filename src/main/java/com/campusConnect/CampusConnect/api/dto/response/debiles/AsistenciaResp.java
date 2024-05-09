package com.campusConnect.CampusConnect.api.dto.response.debiles;

import java.util.Date;

import com.campusConnect.CampusConnect.api.dto.response.intermedias.ClaseResp;
import com.campusConnect.CampusConnect.util.enums.EstadoAsistencia;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsistenciaResp {
    private Long idAsistencia;
    private Date dia;
    private EstadoAsistencia asistencia;
    private ClaseResp clase;
}
