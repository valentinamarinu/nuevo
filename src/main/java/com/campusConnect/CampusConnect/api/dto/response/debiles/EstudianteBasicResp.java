package com.campusConnect.CampusConnect.api.dto.response.debiles;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteBasicResp {
    private String acudientes;
    private List<SeguimientoPsicologicoResp> seguimientosPsicologicos;
}
