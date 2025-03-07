package com.proyectofinal.clave_compas.mappers;

import com.proyectofinal.clave_compas.bd.clavecompas.entities.UserEntity;
import com.proyectofinal.clave_compas.service.dto.UserDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-07T03:59:11-0500",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.6 (Amazon.com Inc.)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(UserEntity user) {
        if ( user == null ) {
            return null;
        }

        Long id = null;
        String firstName = null;
        String lastName = null;
        String document = null;
        String phone = null;
        String address = null;
        String email = null;
        String password = null;

        id = user.getId();
        firstName = user.getFirstName();
        lastName = user.getLastName();
        document = user.getDocument();
        phone = user.getPhone();
        address = user.getAddress();
        email = user.getEmail();
        password = user.getPassword();

        UserDTO userDTO = new UserDTO( id, firstName, lastName, document, phone, address, email, password );

        return userDTO;
    }

    @Override
    public UserEntity toEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.id( userDTO.id() );
        userEntity.firstName( userDTO.firstName() );
        userEntity.lastName( userDTO.lastName() );
        userEntity.document( userDTO.document() );
        userEntity.phone( userDTO.phone() );
        userEntity.address( userDTO.address() );
        userEntity.email( userDTO.email() );
        userEntity.password( userDTO.password() );

        return userEntity.build();
    }
}
