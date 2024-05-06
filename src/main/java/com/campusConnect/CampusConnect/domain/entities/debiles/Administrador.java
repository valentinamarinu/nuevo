package com.campusConnect.CampusConnect.domain.entities.debiles;

import com.campusConnect.CampusConnect.domain.entities.fuertes.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "administrador")
@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
public class Administrador extends Usuario{
    @Id
    @Override
    public String getIdUsuario() {
        return super.getIdUsuario();
    }

    @Column(nullable = false)
    private String descripcionCargo;

}
