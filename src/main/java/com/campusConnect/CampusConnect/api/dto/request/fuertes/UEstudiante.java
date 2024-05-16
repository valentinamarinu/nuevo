package com.campusConnect.CampusConnect.api.dto.request.fuertes;

import com.campusConnect.CampusConnect.util.enums.Rol;
import com.campusConnect.CampusConnect.util.enums.TipoDocumento;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UEstudiante {
        @NotBlank(message = "El nombre es requerido.")
    private String nombres;

    @NotBlank(message = "Los apellidos son requeridos.")
    private String apellidos;

    @NotBlank(message = "El tipo de documento es requerido.")
    private TipoDocumento tipoDocumento;

    @Min(value = 10000000, message = "El número del documento de identificación no debe ser menor 8 dígitos")
    @Max(value = 1999999999, message = "El número del documento de identificación no debe exceder los 10 dígitos.")
    private int documento;

    @Min(value = 1, message = "La edad debe ser menor a 1 año." )
    @Max(value = 70, message = "La edad no debe ser mayor a 70 años.") 
    private Integer edad;

    @Email(message = "El email ingresado no es válido.")
    @Size(min = 5, max = 100, message = "El email debe tener entre 5 y 100 caracteres.")
    private String correo;

    @Size(min = 10, max = 20, message = "El teléfono debe tener entre 10 y 20 caracteres.")
    private String telefono;

    @NotBlank(message = "El rol es requerido.")
    private Rol rol;

    /* Evita que la contraseña se exponga en las respuestas JSON, protegiendo la información confidencial. */
    @JsonIgnoreProperties(value = {"password"})
    @Size(min = 8, max = 64, message = "La contraseña debe ser de 8 o más caracteres, y menor o igual a 64 caracteres.")
    @Pattern(regexp = "^(?=.[a-z])(?=.[A-Z])(?=.[0-9])(?=.[$#@]).*$", message = "La contraseña debe ser una combinación de letras mayúsculas, minúsculas, números y caracteres especiales." )
    private String password;

    /* PENDIENTEEEEEEEEEEEEEEEEEE */
    private String foto;

    @NotNull(message = "El id del estudiante es obligatorio")
    private Long idEstudiante;
}