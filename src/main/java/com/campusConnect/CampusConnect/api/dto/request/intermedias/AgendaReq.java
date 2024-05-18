package com.campusConnect.CampusConnect.api.dto.request.intermedias;

import java.sql.Date;
import java.sql.Time;

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
    @NotNull(message = "La descripción del evento es requerida.")
    private Date eventTitle;

    @NotNull(message = "La fecha de inicio del evento es requerida.")
    private Date eventStartDate;

    @NotNull(message = "La fecha de finalización del evento es requerida.")
    private Date eventEndDate;

    @NotNull(message = "La hora de inicio del evento es requerida.")
    private Time eventStartTime;

    @NotNull(message = "La hora de finalización del evento es requerida.")
    private Time eventEndTime;

    @NotNull(message = "La ubicación del evento es requerida.")
    private String eventLocation;

    @NotNull(message = "El id del evento es requerido.")
    private Long idEvento;

    @NotNull(message = "El id del grupo es requerido.")
    private Long idGrupo;
}
