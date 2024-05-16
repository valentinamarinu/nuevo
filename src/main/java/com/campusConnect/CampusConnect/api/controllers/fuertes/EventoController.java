package com.campusConnect.CampusConnect.api.controllers.fuertes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusConnect.CampusConnect.infrastructure.abstract_services.fuertes.IEventoService;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@RequestMapping("/evento")
@Data
@AllArgsConstructor
public class EventoController {
        /* Inyección de dependencias*/
        @Autowired
        private final IEventoService eventoService;
}
