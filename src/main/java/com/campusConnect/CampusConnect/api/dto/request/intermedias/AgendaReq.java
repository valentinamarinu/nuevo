package com.campusConnect.CampusConnect.api.dto.request.intermedias;

import java.sql.Date;
import java.sql.Time;

import com.campusConnect.CampusConnect.util.enums.EstadoAgenda;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgendaReq {
    @NotNull(message = "El estado de la agenda es requerido.")
    private EstadoAgenda estado;

    @NotNull(message = "La descripción del evento es requerida.")
    private Date evenTitle;

    @NotNull(message = "La fecha de inicio del evento es requerida.")
    private Date evenStartDate;

    @NotNull(message = "La fecha de finalización del evento es requerida.")
    private Date evenEndDate;

    @NotNull(message = "La hora de inicio del evento es requerida.")
    private Time evenStartTime;

    @NotNull(message = "La hora de finalización del evento es requerida.")
    private Time evenEndTime;

    @NotNull(message = "La ubicación del evento es requerida.")
    private String evenLocation;

    @NotNull(message = "La URL del evento es requerido.")
    private String evenURL;

    @NotNull(message = "El id del evento es requerido.")
    private Long idEvento;

    @NotNull(message = "El id del grupo es requerido.")
    private Long idGrupo;
}
