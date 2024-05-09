package com.campusConnect.CampusConnect.api.dto.request.fuertes;

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
public class EventoReq {
    @NotBlank(message = "El título del evento es requerido.")
    @Size(max = 255, message = "El título del evento no puede superar los 255 caracteres.")
    private String titulo;
}
