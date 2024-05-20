package com.campusConnect.CampusConnect.api.dto.response.intermedias;

import java.util.Date;

import com.campusConnect.CampusConnect.util.enums.EstadoAsistencia;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsistenciaBasicResp {
    private Long idAsistencia;
    private Date dia;
    private EstadoAsistencia asistencia;
}
