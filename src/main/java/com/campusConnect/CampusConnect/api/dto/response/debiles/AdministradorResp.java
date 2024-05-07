package com.campusConnect.CampusConnect.api.dto.response.debiles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdministradorResp {
    private Long idAdministrador;
    private String descripcionCargo;
}
