package com.campusConnect.CampusConnect.api.dto.request.debiles;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsignaturaReq {
    @NotBlank(message = "La nombre de la asignatura es requerida.")
    private String nombre;
}
