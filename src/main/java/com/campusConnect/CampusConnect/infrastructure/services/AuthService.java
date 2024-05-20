package com.campusConnect.CampusConnect.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.campusConnect.CampusConnect.api.dto.request.security.AdministradorRegisterReq;
import com.campusConnect.CampusConnect.api.dto.request.security.EstudianteRegisterReq;
import com.campusConnect.CampusConnect.api.dto.request.security.LoginReq;
import com.campusConnect.CampusConnect.api.dto.request.security.ProfesorRegisterReq;
import com.campusConnect.CampusConnect.api.dto.request.security.RegisterReq;
import com.campusConnect.CampusConnect.api.dto.response.AuthResp;
import com.campusConnect.CampusConnect.domain.entities.fuertes.Usuario;
import com.campusConnect.CampusConnect.domain.repositories.fuertes.UsuarioRepository;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.IAuthService;
import com.campusConnect.CampusConnect.infrastructure.helpers.JwtService;
import com.campusConnect.CampusConnect.util.exceptions.BadRequestException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthService  implements IAuthService{

    @Autowired
    private final UsuarioRepository usuarioRepository;

    @Autowired
    private final JwtService jwtService;

    @Autowired
    private final PasswordEncoder passwordEncoder;

    @Autowired
    private final AuthenticationManager authenticationManager;

    @Override
    public AuthResp login(LoginReq request){

        try {
             //autentica en la app el usario y contraseña
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword()));
        } catch (Exception e) {
            throw new BadRequestException("Credenciales invalidas");
        }
        //si el usuario se autentico correctamente
        Usuario usuario = this.findByCorreo(request.getUserName());
        if (usuario == null) {
            throw new BadRequestException("El usuario no esta registrado");
        }

        return AuthResp.builder()
                .message("Autenticado correctamente")
                .token(this.jwtService.getToken(usuario))
                .build();
       
    }

    //registro para el administrador
    @Override
    public AuthResp register(RegisterReq request){
        /* Validar que el usuario no existe */
        Usuario exist = this.findByCorreo(request.getEmail());

        if (exist != null) {
            try {
                throw new BadRequestException("Este correo ya esta registrado");
            } catch (BadRequestException e) {
                e.printStackTrace();
            }
        }

        /* Construir el usuario */
        Usuario user = Usuario.builder()
                        .nombres(request.getNombres())
                        .apellidos(request.getApellidos())
                        .documento(request.getDocumento())
                        .edad(request.getEdad())
                        .telefono(request.getTelefono())
                        .correo(request.getEmail())
                        .password(passwordEncoder.encode(request.getPassword()))
                        //.password(passwordEncoder.encode(request.getPassword())) //guardar la contraseña codificada
                        .rol(Rol.ADMINISTRADOR)                /* no se como registrar que tipo desde el inicio */
                        .build();
        /* Se Guarda el usuario en la db */
        user = this.usuarioRepository.save(user);

        return AuthResp.builder()
                .message("Registro completado exitosamente")
                .token(this.jwtService.getToken(user))
                .build();
    }

    /*Metodo para registrar un estudiante */
    @Override
    public AuthResp registerEstudiante(EstudianteRegisterReq request) {
       /*Validamos que el usuario no exista */
       Usuario exist = this.findByCorreo(request.getCorreo());

       if (exist != null) {
            throw new BadRequestException("El usuario ya esta registrado");
       }
       /*Construimos el estudiante */
       Usuario user = Usuario.builder()
                        .nombres(request.getNombres())
                        .apellidos(request.getApellidos())
                        .documento(request.getDocumento())
                        .edad(request.getEdad())
                        .telefono(request.getTelefono())
                        .correo(request.getEmail())
                        .password(passwordEncoder.encode(request.getPassword()))
                        //.password(passwordEncoder.encode(request.getPassword())) //guardar la contraseña codificada
                        .rol(Rol.ESTUDIANTE)                /* no se como registrar que tipo desde el inicio */
                        .build();

        /* Se Guarda el usuario en la db */
        Usuario usuarioSave = this.usuarioRepository.save(user);


    }

    @Override
    public AuthResp registerProfesor(ProfesorRegisterReq request) {
        /*Validamos que el usuario no exista */
       Usuario exist = this.findByCorreo(request.getCorreo());

       if (exist != null) {
            throw new BadRequestException("El usuario ya esta registrado");
       }
       /*Construimos el estudiante */
       Usuario user = Usuario.builder()
                        .nombres(request.getNombres())
                        .apellidos(request.getApellidos())
                        .documento(request.getDocumento())
                        .edad(request.getEdad())
                        .telefono(request.getTelefono())
                        .correo(request.getEmail())
                        .password(passwordEncoder.encode(request.getPassword()))
                        //.password(passwordEncoder.encode(request.getPassword())) //guardar la contraseña codificada
                        .rol(Rol.ESTUDIANTE)                /* no se como registrar que tipo desde el inicio */
                        .build();

        /* Se Guarda el usuario en la db */
        Usuario usuarioSave = this.usuarioRepository.save(user);

        return AuthResp.builder()
                .message("Registro de estudiante completado exitosamente")
                .token(this.jwtService.getToken(usuarioSave))
                .build();
    }
    
    private Usuario findByCorreo(String userEmail){
        return this.usuarioRepository.findByCorreo(userEmail).orElse(null);
    }
}

/* Token generado por el usuario jccaste1002@gmail.com
 * eyJhbGciOiJIUzUxMiJ9.eyJyb2xlIjoiQURNSU5JU1RSQURPUiIsImlkIjoiYTRjMzYwNDktM2UxYi00YTg2LTg4YTctZjE2ODBkOTcyMDIyIiwic3ViIjoiY2FtaWxvY2FzdGVsbGFub3MxMDAyIiwiaWF0IjoxNzE1OTY0MzMyLCJleHAiOjE3MTYwNTA3MzJ9.w7m-f2ivb321kj4REAZj9fPmO15qbqD-Mhyb7JmcR6FtK4SNmlNK_s8_MqL3QY1bdtXhlB91DZ5zyU3EzF0Wlw
 */
