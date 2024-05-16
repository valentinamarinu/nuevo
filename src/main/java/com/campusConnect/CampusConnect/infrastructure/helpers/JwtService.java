package com.campusConnect.CampusConnect.infrastructure.helpers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import com.campusConnect.CampusConnect.domain.entities.fuertes.Usuario;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component //un component puede ser un repositorio, entidad, servicio, .....  para poder trabajar servicio con un component
public class JwtService {

    /* 1 Crear firma o clave */
    /* llave sin codificar base64: 
        pag para codificar: https://www.base64encode.org/
        mi super clave secreta secreta secreta, mi super clave secreta secreta secreta 
    */ 
    /* llave codificada en base 64 */
    private final String SECRET_KEY = "bWkgc3VwZXIgY2xhdmUgc2VjcmV0YSBzZWNyZXRhIHNlY3JldGEsIG1pIHN1cGVyIGNsYXZlIHNlY3JldGEgc2VjcmV0YSBzZWNyZXRh";

    /*2  metodo para encriptar la clave secreta */
    public SecretKey getKey(){
        //array de bytes, decodifica la llave base 64 y luego lo convierte a bytes
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY); 

        //se retorna la llave cifrada
        return Keys.hmacShaKeyFor(keyBytes);
    }
    /*3 Construir el JWT */
    public String getToken(Map<String,Object> claims, Usuario user){

        return Jwts.builder()
                .claims(claims) //agrego el cuerpo del jwt
                .subject(user.getCorreo()) //agrego de quien es el jwt
                .issuedAt(new Date(System.currentTimeMillis())) //fecha de creacion que viene del sistema
                .expiration(new Date(System.currentTimeMillis()+ 1000*60*60*24)) //fecha de expiracion
                .signWith(this.getKey()) //firmar el token
                .compact();
    }
    /*  4 mEtodo para obtener el jwt*/
    public String getToken(Usuario user){
        //crear el map de claims
        Map<String, Object> claims = new HashMap<>();

        claims.put("id", user.getIdUsuario());
        claims.put("role", user.getRol().name());

        return getToken(claims, user);

    }
    
}
