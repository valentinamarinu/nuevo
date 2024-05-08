package com.campusConnect.CampusConnect.api.controllers.fuertes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusConnect.CampusConnect.api.dto.response.fuertes.UsuarioResp;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.fuertes.IUsuarioService;


import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.campusConnect.CampusConnect.util.enums.SortType;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {
    /* Inyección de dependencias*/
    @Autowired
    private final IUsuarioService userService;

    @GetMapping
    public ResponseEntity<Page<UsuarioResp>> get(
        @RequestParam(defaultValue = "1") int page,
        @RequestParam(defaultValue = "1") int size, 
        @RequestParam(defaultValue = "NONE") SortType sortType
        ) {
        return ResponseEntity.ok(this.userService.getAll(page - 1, size, sortType)) ;
    }
    
}
