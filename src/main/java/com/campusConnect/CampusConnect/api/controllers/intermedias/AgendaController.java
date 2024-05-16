package com.campusConnect.CampusConnect.api.controllers.intermedias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusConnect.CampusConnect.infrastructure.abstract_services.intermedias.IAgendaService;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@RequestMapping("/agenda")
@Data
@AllArgsConstructor
public class AgendaController {
        /* Inyección de dependencias*/
        @Autowired
        private final IAgendaService agendaService;
}
