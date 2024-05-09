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
public class ProfesorReq {
    @NotBlank(message = "La información de la hoja de vida del profesor es requerida.")
    private String hojaVida;

}
