package com.campusConnect.CampusConnect.api.dto.response.fuertes;

import com.campusConnect.CampusConnect.api.dto.response.debiles.AdministradorResp;
import com.campusConnect.CampusConnect.domain.entities.debiles.Estudiante;
import com.campusConnect.CampusConnect.domain.entities.debiles.Profesor;
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
public class UsuarioResp {
    private String idUsuario;
    private String nombres;
    private String apellidos;
    private TipoDocumento tipoDocumento;
    private int documento;
    private Integer edad;
    private String correo;
    private String telefono;
    private Rol rol;
    private String password;
    private String foto;
    /* private ProfesorResp profesor;
    private EstudianteResp estudiante; */
    private AdministradorResp administrador;
}
