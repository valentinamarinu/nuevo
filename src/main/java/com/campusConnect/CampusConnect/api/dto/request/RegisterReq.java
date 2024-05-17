package com.campusConnect.CampusConnect.api.dto.request;

import com.campusConnect.CampusConnect.util.enums.Rol;
import com.campusConnect.CampusConnect.util.enums.TipoDocumento;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterReq {
    
    @NotBlank(message = "El usuario es obligatorio")
    @Size(min = 8, max = 150,message = "El usuario debe tener entre 8 y 150 caracteres")
    private String email;
    @NotBlank(message = "La contraseña es obligatorio")
    @Size(min = 8, max = 150,message = "La contraseña debe tener entre 8 y 150 caracteres")
    // @Pattern(regexp = "expresion regular")
    private String password;
    
    @Column(nullable = false)//atributo obligatorio
    private String nombres;

    @Column(nullable = false)
    private String apellidos;
    
    @Enumerated(EnumType.STRING) //acepta valores existentes, en mysql es un check in con 3 tipos de valores determinados
    private TipoDocumento tipoDocumento;

    @Column(nullable = false, unique = true) //atributo obligatorio y es unico
    private int documento;

    @Column(nullable = false)
    private Integer edad;
    
    @Column(nullable = false)
    private String correo;

    @Column(nullable = false)
    private String telefono;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    /* REVISAR BIEN SUGERENCIA DE KEVIN, subir imagen y una api que pase eso a url*/
    private String foto;
}
