package com.campusConnect.CampusConnect.api.dto.response.nuevo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PAsignaturaResp {
    private String nombre;
    private AsignaturaGrupoResp grupo;
}
