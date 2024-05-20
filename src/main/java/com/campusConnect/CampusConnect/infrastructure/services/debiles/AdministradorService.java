package com.campusConnect.CampusConnect.infrastructure.services.debiles;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.campusConnect.CampusConnect.api.dto.request.debiles.AdministradorReq;
import com.campusConnect.CampusConnect.api.dto.request.fuertes.UAdministradorReq;
import com.campusConnect.CampusConnect.api.dto.response.debiles.AdministradorResp;
import com.campusConnect.CampusConnect.api.dto.response.fuertes.UAdministradorResp;
import com.campusConnect.CampusConnect.domain.entities.debiles.Administrador;
import com.campusConnect.CampusConnect.domain.entities.fuertes.Usuario;
import com.campusConnect.CampusConnect.domain.repositories.debiles.AdministradorRepository;
import com.campusConnect.CampusConnect.domain.repositories.fuertes.UsuarioRepository;
import com.campusConnect.CampusConnect.infrastructure.abstract_services.debiles.IAdministradorService;
import com.campusConnect.CampusConnect.util.enums.SortType;
import com.campusConnect.CampusConnect.util.exceptions.BadRequestException;
import com.campusConnect.CampusConnect.util.messages.ErrorMessages;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@Data
@AllArgsConstructor
public class AdministradorService implements IAdministradorService {
    @Autowired
    private final UsuarioRepository usuarioRepository;

    @Autowired
    private final AdministradorRepository administradorRepository;

    @Override
    public Page<UAdministradorResp> getAll(int page, int size, SortType sortType) {
        if (page < 0) page = 0;
        PageRequest pageRequest = null;

        switch (sortType) {
            case NONE -> pageRequest = PageRequest.of(page, size);
            case ASC -> pageRequest = PageRequest.of(page, size, Sort.by(FIEL_BY_SORT).ascending());
            case DESC -> pageRequest = PageRequest.of(page, size, Sort.by(FIEL_BY_SORT).descending());
        }

        Pageable pageable = pageRequest;
        return this.usuarioRepository.findAll(pageable).map(this::usuarioToResponse);
    }

    @Override
    public UAdministradorResp create(UAdministradorReq request) {
        Administrador administrador = this.administradorRepository.findById(request.getIdAdministrador())
        .orElseThrow(() -> new BadRequestException(ErrorMessages.idNotFound("Administrador")));

        Usuario usuario = this.usuarioRequestToEntity(request);

        usuario.setAdministrador(administrador);

        return this.usuarioToResponse(this.usuarioRepository.save(usuario));
    }

    @Override
    public UAdministradorResp update(UAdministradorReq request, String id) {
        Usuario usuario = this.find(id);

        Administrador administrador = this.administradorRepository.findById(request.getIdAdministrador())
        .orElseThrow(() -> new BadRequestException(ErrorMessages.idNotFound("Administrador")));

        usuario = this.usuarioRequestToEntity(request);

        usuario.setAdministrador(administrador);
        usuario.setIdUsuario(id);

        return this.usuarioToResponse(this.usuarioRepository.save(usuario));
    }

    @Override
    public void delete(String id) {
        this.usuarioRepository.delete(this.find(id));
    }

    @Override
    public UAdministradorResp getById(String id) {
        return this.usuarioToResponse(this.find(id));
    }

    private UAdministradorResp usuarioToResponse(Usuario usuario) { 
        AdministradorResp administrador = new AdministradorResp();
        BeanUtils.copyProperties(usuario.getAdministrador(), administrador);

        return UAdministradorResp.builder()
                .idUsuario(usuario.getIdUsuario())
                .nombre(usuario.getNombre())
                .apellidos(usuario.getApellidos())
                .tipoDocumento(usuario.getTipoDocumento())
                .documento(usuario.getDocumento())
                .fechaNacimiento(usuario.getFechaNacimiento())
                .correo(usuario.getCorreo())
                .telefono(usuario.getTelefono())
                .rol(usuario.getRol())
                .password(usuario.getPassword())
                .foto(usuario.getFoto())
                .descripcionCargo(administrador.getDescripcionCargo())
                .build();
    }

    private Usuario usuarioRequestToEntity(UAdministradorReq request) {
        AdministradorReq administradorReq = new AdministradorReq();
        BeanUtils.copyProperties(request.getIdAdministrador(), administradorReq);

        return Usuario.builder()
                .nombre(request.getNombre())
                .apellidos(request.getApellidos())
                .tipoDocumento(request.getTipoDocumento())
                .documento(request.getDocumento())
                .fechaNacimiento(request.getFechaNacimiento())
                .correo(request.getCorreo())
                .telefono(request.getTelefono())
                .rol(request.getRol())
                .password(request.getPassword())
                .foto(request.getFoto())
                .administrador(administradorRequestToEntity(administradorReq))
                .build();
    }

    private Administrador administradorRequestToEntity(AdministradorReq request) {
        return Administrador.builder()
                .descripcionCargo(request.getDescripcionCargo())
                .build();
    }

    private Usuario find(String id) {
        return this.usuarioRepository.findById(id).orElseThrow(() -> new BadRequestException(ErrorMessages.idNotFound("Administrador")));
    }
}
