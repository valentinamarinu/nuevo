package com.campusConnect.CampusConnect.api.dto.request.fuertes;

import java.util.List;

import com.campusConnect.CampusConnect.domain.entities.debiles.Estudiante;
import com.campusConnect.CampusConnect.domain.entities.intermedias.Agenda;
import com.campusConnect.CampusConnect.domain.entities.intermedias.Clase;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GrupoReq {
    @NotBlank(message = "El nombre del grupo es requerido.")
    private String nombre;

    /* Lista de estudiantes por grupo */
    @Size(min = 1, max = 50, message = "El grupo debe tener entre 1 y 50 estudiantes.")
    private List<Estudiante> estudiantes;

    /* Lista de agendas por grupo */
    private List<Agenda> agendas;

    /* Lista de clases por grupo */
    @Size(min = 1, message = "El grupo debe tener almenos una clase asignada.")
    private List<Clase> clases;
}
