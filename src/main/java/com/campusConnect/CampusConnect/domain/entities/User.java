package com.campusConnect.CampusConnect.domain.entities;

import com.campusConnect.CampusConnect.util.enums.Rol;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity(name = "users") //para no chocar con el user de MySQL
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(length = 150, nullable = false, unique = true)
    private String userName;
    @Column(length = 150, nullable = false)
    private String password;
    private Rol role;

    //minuto 26:19 del video #12 de kevin
}
