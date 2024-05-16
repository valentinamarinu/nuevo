package com.campusConnect.CampusConnect.domain.repositories.fuertes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.campusConnect.CampusConnect.domain.entities.fuertes.Usuario;
import com.campusConnect.CampusConnect.util.enums.Rol;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    @Query(value = "SELECT  u FROM usuario u WHERE u.apellidos :lastname")
    public List<Usuario> findByLastname(String lastname);

    @Query(value = "SELECT  u FROM usuario u WHERE u.nombres :name")
    public List<Usuario> findByFirstname(String name);

    @Query(value = "SELECT  u FROM usuario u WHERE u.documento :doc")
    public List<Usuario> findByDocumento(int doc);

    @Query(value = "SELECT  u FROM usuario u WHERE u.edad :age")
    public List<Usuario> findByEdad(Integer age);

    @Query(value = "SELECT  u FROM usuario u WHERE u.correo :correo")
    public List<Usuario> findByCorreo(int correo);

    @Query(value = "SELECT  u FROM usuario u WHERE u.telefono :tel")
    public List<Usuario> findByTelefono(String tel);

    @Query(value = "SELECT  u FROM usuario u WHERE u.rol :rol")
    public List<Usuario> findByRol(Rol rol);

}
