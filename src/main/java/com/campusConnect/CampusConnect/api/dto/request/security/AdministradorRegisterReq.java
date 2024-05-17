package com.campusConnect.CampusConnect.api.dto.request.security;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AdministradorRegisterReq extends RegisterReq {
    @NotBlank(message = "La descripción del cargo es requerida.")
    private String descripcionCargo;
}
