package com.campusConnect.CampusConnect.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.campusConnect.CampusConnect.infrastructure.helpers.JwtAuthenticationFilter;

import lombok.AllArgsConstructor;

@Configuration //anotacion para clase de configuracion en spring boot
@EnableWebSecurity //anotacion para especificar configurar de configuracion
@AllArgsConstructor
public class SecurityConfig {

    @Autowired
    private final AuthenticationProvider authenticationProvider;

    @Autowired
    private final JwtAuthenticationFilter jwtAuthenticationFilter;
    
    //array de todas las rutas publicas
    private final String[] PUBLIC_RESOURCES = {"/eventos/public/get", "/auth/**"}; /* PENDIENTEEEEEEEEEEE */
    //filtros

        /*
         *@Bean : Esta anotacion le indica a spring boot que el objeto retornado por el metodo debe ser registrado como un bean en el contexto de spring (dentro de la lata)
         */
        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{ //recibe un http security y se implementa excepcion como un try catch
            return http
                    .csrf(csrf->csrf.disable()) //desabilitar proteccion csrf -> por que es para statelest
                    .authorizeHttpRequests(authRequest-> authRequest //metodo para configurar rutas publicas y privadas y recibe un lambda
                        .requestMatchers(PUBLIC_RESOURCES).permitAll() //si el request hace match con algo, permitale todo
                        .anyRequest().authenticated() //todo lo que sea diferente a las rutas publicas nesesita autenticacion
                    )
                    .sessionManagement(sessionManager-> sessionManager
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)) //poliza de tipo stateless para mantener sesiones
                    .authenticationProvider(this.authenticationProvider)
                    //agregamos el filtro de JWT antes del filtro de autenticacion de usuario y contraseña
                    //filtro 0 -> jwtAuthenticationFilter, filtro 1 user y password
                    .addFilterBefore(this.jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class) 
                    .build();
        }
}
