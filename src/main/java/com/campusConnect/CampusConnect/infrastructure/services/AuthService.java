package com.campusConnect.CampusConnect.infrastructure.services;

import javax.management.relation.Role;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import com.campusConnect.CampusConnect.api.dto.request.AdministradorRegisterReq;
import com.campusConnect.CampusConnect.api.dto.request.EstudianteRegisterReq;
import com.campusConnect.CampusConnect.api.dto.request.LoginReq;
import com.campusConnect.CampusConnect.api.dto.request.ProfesorRegisterReq;
import com.campusConnect.CampusConnect.api.dto.request.RegisterReq;
import com.campusConnect.CampusConnect.api.dto.response.AuthResp;
import com.campusConnect.CampusConnect.domain.entities.fuertes.Usuario;
import com.campusConnect.CampusConnect.domain.repositories.fuertes.UsuarioRepository;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.IAuthService;
import com.campusConnect.CampusConnect.infrastructure.helpers.JwtService;
import com.campusConnect.CampusConnect.util.enums.Rol;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthService  implements IAuthService{

    @Autowired
    private final UsuarioRepository usuarioRepository;

    @Autowired
    private final JwtService jwtService;

    @Override
    public AuthResp login(LoginReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public AuthResp register(RegisterReq request) throws BadRequestException{
        /* Validar que el usuario no existe */
        Usuario exist = this.findByUsuario(request.getUserName());

        if (exist != null) {
            throw new BadRequestException("El usuario ya existe");
        }

        /* Construir el usuario */
        Usuario user = Usuario.builder()
                        .nombres(request.getUserName())
                        .password(request.getPassword())
                        .rol(Rol.ESTUDIANTE)                /* no se como registrar que tipo desde el inicio */
                        .build();
        /* Se Guarda el usuario en la db */
        user = this.usuarioRepository.save(user);

        return AuthResp.builder()
                .message("Registro completado exitosamente")
                .token(this.jwtService.getToken(user))
                .build();
    }

    @Override
    public AuthResp registerAdministrador(AdministradorRegisterReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerAdministrador'");
    }

    @Override
    public AuthResp registerEstudiante(EstudianteRegisterReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerEstudiante'");
    }

    @Override
    public AuthResp registerProfesor(ProfesorRegisterReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerProfesor'");
    }
    
    private Usuario findByUsuario(String userEmail){
        return this.usuarioRepository.findByUsuario(userEmail).orElse(null);
    }
}
