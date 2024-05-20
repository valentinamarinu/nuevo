package com.campusConnect.CampusConnect.api.dto.response.fuertes;

import java.math.BigInteger;
import java.sql.Date;

import com.campusConnect.CampusConnect.util.enums.Rol;
import com.campusConnect.CampusConnect.util.enums.TipoDocumento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UAdministradorResp {
    private String idUsuario;
    private String nombre;
    private String apellidos;
    private TipoDocumento tipoDocumento;
    private BigInteger documento;
    private Date fechaNacimiento;
    private String correo;
    private String telefono;
    private Rol rol;
    private String password;
    private String foto;
    private String descripcionCargo;
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