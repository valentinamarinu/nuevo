package com.campusConnect.CampusConnect.api.dto.response.intermedias;

import java.sql.Date;
import java.sql.Time;

import com.campusConnect.CampusConnect.api.dto.response.fuertes.EventoResp;
import com.campusConnect.CampusConnect.api.dto.response.fuertes.GrupoResp;
import com.campusConnect.CampusConnect.util.enums.EstadoAgenda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgendaResp {
    private Long idAgenda;
    private EstadoAgenda estado;
    private Date evenTitle;
    private Date evenStartDate;
    private Date evenEndDate;
    private Time evenStartTime;
    private Time evenEndTime;
    private String evenLocation;
    private String evenURL;
    private EventoResp evento;
    private GrupoResp grupo;
}
