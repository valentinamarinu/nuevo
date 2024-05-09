package com.campusConnect.CampusConnect.api.controllers.debiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusConnect.CampusConnect.infrastructure.abstract_services.debiles.IEstudianteService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/estudiante")
@AllArgsConstructor
public class EstudianteController {
        /* Inyección de dependencias*/
        @Autowired
        private final IEstudianteService estudianteService;
}
