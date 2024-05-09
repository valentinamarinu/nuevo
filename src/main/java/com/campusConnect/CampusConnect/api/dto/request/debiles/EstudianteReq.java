package com.campusConnect.CampusConnect.api.dto.request.debiles;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteReq {
    @NotBlank(message = "La información de los acudientes del estudiante es requerida.")
    private String acudientes;
    
    @NotNull(message = "El id del grupo al que pertenece el estudiante es requerido.")
    private Long idGrupo;
}
