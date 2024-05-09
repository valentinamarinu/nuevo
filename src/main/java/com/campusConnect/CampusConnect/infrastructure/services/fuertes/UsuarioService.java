package com.campusConnect.CampusConnect.infrastructure.services.fuertes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.campusConnect.CampusConnect.api.dto.request.fuertes.UsuarioReq;
import com.campusConnect.CampusConnect.api.dto.response.fuertes.UsuarioResp;
import com.campusConnect.CampusConnect.domain.entities.fuertes.Usuario;
import com.campusConnect.CampusConnect.domain.repositories.fuertes.UsuarioRepository;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.fuertes.IUsuarioService;
import com.campusConnect.CampusConnect.util.enums.SortType;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UsuarioService implements IUsuarioService{
    /* Inyección de dependencias */
    @Autowired
    private final UsuarioRepository usuarioRepository;

    /* Métodos implementados de IUsuarioService*/
    @Override
    public Page<UsuarioResp> getAll(int page, int size, SortType sortType) {
        if (page < 0) page = 0;

        PageRequest pagination = null;

        /* Aquí estoy filtrando por rol porque definí en IUsuarioService a FIELD_BY_SORT como "rol" */
        switch (sortType) {
          case NONE: pagination = PageRequest.of(page, size);
          case ASC: pagination = PageRequest.of(page, size, Sort.by(FIELD_BY_SORT).ascending());
          case DESC: pagination = PageRequest.of(page, size, Sort.by(FIELD_BY_SORT).descending());
        }

        /* Otra forma this.usuarioRepository.findAll(pagination).map(this::entityToResponse) */
        return this.usuarioRepository.findAll(pagination).map(usuario -> this.entityToResponse(usuario));
    }

    @Override
    public UsuarioResp create(UsuarioReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public UsuarioResp update(UsuarioReq request, String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public UsuarioResp getById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    /* Método encargado de convertir objeto Usuario a UsuarioResp */
    private UsuarioResp entityToResponse(Usuario usuario){
        return UsuarioResp.builder()
                .idUsuario(usuario.getIdUsuario())
                .nombres(usuario.getNombres())
                .apellidos(usuario.getApellidos())
                .tipoDocumento(usuario.getTipoDocumento())
                .documento(usuario.getDocumento())
                .edad(usuario.getEdad())
                .correo(usuario.getCorreo())
                .telefono(usuario.getTelefono())
                .rol(usuario.getRol())
                .password(usuario.getPassword())
                .foto(usuario.getFoto())
                // .profesor()
                // .administrador(usuario.getAdministrador())
                // .estudiante(usuario.getEstudiante())
                .build();
    }
}
