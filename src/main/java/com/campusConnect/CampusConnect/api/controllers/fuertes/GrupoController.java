package com.campusConnect.CampusConnect.api.controllers.fuertes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusConnect.CampusConnect.infrastructure.abstract_services.fuertes.IGrupoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/grupo")
@AllArgsConstructor
public class GrupoController {
        /* Inyección de dependencias*/
        @Autowired
        private final IGrupoService grupoService;
}
