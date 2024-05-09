package com.campusConnect.CampusConnect.api.dto.response.debiles;

import java.util.List;

import com.campusConnect.CampusConnect.api.dto.response.intermedias.ClaseResp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsignaturaResp {
    private Long idAsignatura;
    private String nombre;
    private List<ClaseResp> clases;
}
