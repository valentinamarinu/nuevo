package com.campusConnect.CampusConnect.api.dto.response.fuertes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GrupoBasicResp {
    private Long idGrupo;
    private String nombre;
}
