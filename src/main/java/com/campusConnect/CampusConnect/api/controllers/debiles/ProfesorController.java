package com.campusConnect.CampusConnect.api.controllers.debiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusConnect.CampusConnect.infrastructure.abstract_services.debiles.IProfesorService;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@RequestMapping("/profesor")
@Data
@AllArgsConstructor
public class ProfesorController {
        /* Inyección de dependencias*/
        @Autowired
        private final IProfesorService profesorService;
}
