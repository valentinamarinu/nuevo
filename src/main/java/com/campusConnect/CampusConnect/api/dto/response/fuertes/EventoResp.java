package com.campusConnect.CampusConnect.api.dto.response.fuertes;

import java.util.List;

import com.campusConnect.CampusConnect.api.dto.response.intermedias.AgendaResp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventoResp {
    private Long idEvento;
    private String titulo;
    private List<AgendaResp> agendas;
}
