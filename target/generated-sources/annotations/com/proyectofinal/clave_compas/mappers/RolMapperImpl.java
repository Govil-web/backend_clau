package com.proyectofinal.clave_compas.mappers;

import com.proyectofinal.clave_compas.bd.clavecompas.entities.RolEntity;
import com.proyectofinal.clave_compas.service.dto.RolDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-07T04:20:21-0500",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.6 (Amazon.com Inc.)"
)
public class RolMapperImpl implements RolMapper {

    @Override
    public RolDTO toDTO(RolEntity rolEntity) {
        if ( rolEntity == null ) {
            return null;
        }

        Long id = null;
        String name = null;

        id = rolEntity.getId();
        name = rolEntity.getName();

        RolDTO rolDTO = new RolDTO( id, name );

        return rolDTO;
    }

    @Override
    public RolEntity toEntity(RolDTO rolDTO) {
        if ( rolDTO == null ) {
            return null;
        }

        RolEntity.RolEntityBuilder rolEntity = RolEntity.builder();

        rolEntity.id( rolDTO.id() );
        rolEntity.name( rolDTO.name() );

        return rolEntity.build();
    }

    @Override
    public List<RolDTO> toDTOs(List<RolEntity> roles) {
        if ( roles == null ) {
            return null;
        }

        List<RolDTO> list = new ArrayList<RolDTO>( roles.size() );
        for ( RolEntity rolEntity : roles ) {
            list.add( toDTO( rolEntity ) );
        }

        return list;
    }

    @Override
    public List<RolEntity> toEntities(List<RolDTO> rolesDTO) {
        if ( rolesDTO == null ) {
            return null;
        }

        List<RolEntity> list = new ArrayList<RolEntity>( rolesDTO.size() );
        for ( RolDTO rolDTO : rolesDTO ) {
            list.add( toEntity( rolDTO ) );
        }

        return list;
    }
}
