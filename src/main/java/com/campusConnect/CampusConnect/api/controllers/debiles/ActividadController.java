package com.campusConnect.CampusConnect.api.controllers.debiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusConnect.CampusConnect.infrastructure.abstract_services.debiles.IActividadService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/actividad")
@AllArgsConstructor
public class ActividadController {
    /* Inyección de dependencias*/
    @Autowired
    private final IActividadService actividadService;

    
}
