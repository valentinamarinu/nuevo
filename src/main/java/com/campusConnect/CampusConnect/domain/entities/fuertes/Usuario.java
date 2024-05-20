package com.campusConnect.CampusConnect.domain.entities.fuertes;


import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.campusConnect.CampusConnect.domain.entities.debiles.Administrador;
import com.campusConnect.CampusConnect.domain.entities.debiles.Estudiante;
import com.campusConnect.CampusConnect.domain.entities.debiles.Profesor;
import com.campusConnect.CampusConnect.util.enums.Rol;
import com.campusConnect.CampusConnect.util.enums.TipoDocumento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity(name = "usuario")
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements UserDetails {
    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idUsuario;

    @Column(nullable = false)//atributo obligatorio
    private String nombres;

    @Column(nullable = false)
    private String apellidos;
    
    @Enumerated(EnumType.STRING) //acepta valores existentes, en mysql es un check in con 3 tipos de valores determinados
    private TipoDocumento tipoDocumento;

    @Column(nullable = false, unique = true) //atributo obligatorio y es unico
    private int documento;

    @Column(nullable = false)
    private Integer edad;
    
    @Column(nullable = false)
    private String correo;

    @Column(nullable = false)
    private String telefono;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    @Column(nullable = false, length = 100)
    /* dto expresion regular para que me la valide */
    private String password;

    /* REVISAR BIEN SUGERENCIA DE KEVIN, subir imagen y una api que pase eso a url*/
    private String foto;

    /* Relación tabla Profesor */
    @OneToOne(mappedBy = "usuario_id")
    private Profesor profesor;

    /* Relación tabla Administrador */
    @OneToOne (mappedBy = "usuario_id")
    private Administrador administrador;

    /* Relación tabla Estudiante */
    @OneToOne (mappedBy = "usuario_id")
    private Estudiante estudiante;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        /*Guarda la autoridad otorgada al usuario autenticado */
        return List.of(new SimpleGrantedAuthority(this.rol.name()));
    }

    //obtener usuario
    @Override
    public String getUsername() {
        return this.correo;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
       return true;
    }

    @Override
    public boolean isEnabled() {
       return true;
    }
}