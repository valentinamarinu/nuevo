package com.campusConnect.CampusConnect.api.dto.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
//import lombok.experimental.SuperBuilder;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AdministradorRegisterReq extends RegisterReq{

    @NotBlank(message = "La descripción del cargo es requerida.")
    private String descripcionCargo;

    @NotBlank(message = "El nombre es requerido.")
    private String nombres;

    @NotBlank(message = "Los apellidos son requeridos.")
    private String apellidos;
    
    @Email(message = "El email no es válido")
    @Size(
        min = 5, 
        max = 100,
        message = "El email debe tener entre 5 y 100 caracteres"
    )
    private String email;  
}
