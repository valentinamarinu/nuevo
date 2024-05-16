package com.campusConnect.CampusConnect.api.error_handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.campusConnect.CampusConnect.api.dto.errors.BaseErrorResponse;
import com.campusConnect.CampusConnect.api.dto.errors.ErrorsResp;

//observador de la app que controla los errores
@RestControllerAdvice
//status por defecto
@ResponseStatus(code = HttpStatus.BAD_REQUEST) //codigo 400 que advierte que no se envian los parametros como se piden
public class BadRequestController {

    @ExceptionHandler(MethodArgumentNotValidException.class) //anotacion que activa la libreria de validacion
    public BaseErrorResponse handleBadRequest(MethodArgumentNotValidException exception){ //recibe el mismo argumento

        List<Map<String,String>>errors = new ArrayList<>(); //genera una lista de maps

        /*
         * getBindingResult obtiene todos los errores que ocurrieron y donde ocurrieron
         * getFieldErrors obtiene la lista de los nombres del campo del error
         */
        exception.getBindingResult().getFieldErrors().forEach(e->{ //se itera cada elemento de la coleccion
            Map<String,String> error = new HashMap<>(); //se genera un map
            //se devuelve un objeto donde se especifica cada error
            error.put("error", e.getDefaultMessage()); //agrega al map el error
            error.put("field", e.getField()); //agrega al map en donde ocurrio el error

            errors.add(error);

        }); 
        return ErrorsResp.builder()
                .code(HttpStatus.BAD_REQUEST.value()) //devuelve el valor numerico del error
                .status(HttpStatus.BAD_REQUEST.name()) //devuelve el string del status
                .errors(errors) //[{"field": "mal", "errors": "mal" }]
                .build();
    }
}
