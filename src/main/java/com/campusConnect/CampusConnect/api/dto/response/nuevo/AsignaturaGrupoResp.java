package com.campusConnect.CampusConnect.api.dto.response.nuevo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsignaturaGrupoResp {
    private Long idGrupo;
    private String nombre;
    // private List<AsitenciaResp> estudiantes;

}
/*
 * entityToResponse
 * 
 * List<String> nombres = entity.getUEstudiante().stream().map( estudiante -> estudiante.getName()).colector(blahblah)
 * 
 * 
 * 
 * 
 * AsignaturaGrupoResp.builder()
 * .estudiantes(nombres)
 * .build()
 */