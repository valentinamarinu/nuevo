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
public class AdministradorReq {
    @NotBlank(message = "La descripción del cargo es requerida.")
    private String descripcionCargo;
}
