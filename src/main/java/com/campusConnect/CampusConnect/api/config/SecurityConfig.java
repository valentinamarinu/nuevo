package com.campusConnect.CampusConnect.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //anotacion para clase de configuracion en spring boot
@EnableWebSecurity //anotacion para especificar configurar de configuracion
public class SecurityConfig {
    
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
                    ).build();
        }
}