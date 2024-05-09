package com.campusConnect.CampusConnect.api.controllers.debiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusConnect.CampusConnect.infrastructure.abstract_services.fuertes.IAsignaturaService;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.fuertes.IUsuarioService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/asignatura")
@AllArgsConstructor
public class AsignaturaController {
    /* Inyección de dependencias*/
    @Autowired
    private final IAsignaturaService asignaturaService;
}
