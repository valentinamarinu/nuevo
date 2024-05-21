package com.campusConnect.CampusConnect.api.controllers.fuertes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusConnect.CampusConnect.infrastructure.abstract_services.fuertes.IEstudianteService;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@RequestMapping("/estudiante")
@Data
@AllArgsConstructor
public class EstudianteController {
        /* Inyección de dependencias*/
        @Autowired
        private final IEstudianteService estudianteService;
}
