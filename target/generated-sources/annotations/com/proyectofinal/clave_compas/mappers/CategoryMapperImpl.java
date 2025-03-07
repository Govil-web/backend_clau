package com.proyectofinal.clave_compas.mappers;

import com.proyectofinal.clave_compas.bd.clavecompas.entities.CategoryEntity;
import com.proyectofinal.clave_compas.service.dto.CategoryDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-07T03:59:11-0500",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.6 (Amazon.com Inc.)"
)
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO toCategoryDTO(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        Integer idCategory = null;
        String name = null;

        idCategory = categoryEntity.getIdCategory();
        name = categoryEntity.getName();

        CategoryDTO categoryDTO = new CategoryDTO( idCategory, name );

        return categoryDTO;
    }

    @Override
    public CategoryEntity toCategoryEntity(CategoryDTO categoryDTO) {
        if ( categoryDTO == null ) {
            return null;
        }

        CategoryEntity.CategoryEntityBuilder categoryEntity = CategoryEntity.builder();

        categoryEntity.idCategory( categoryDTO.idCategory() );
        categoryEntity.name( categoryDTO.name() );

        return categoryEntity.build();
    }

    @Override
    public List<CategoryDTO> toDTOs(List<CategoryEntity> categories) {
        if ( categories == null ) {
            return null;
        }

        List<CategoryDTO> list = new ArrayList<CategoryDTO>( categories.size() );
        for ( CategoryEntity categoryEntity : categories ) {
            list.add( toCategoryDTO( categoryEntity ) );
        }

        return list;
    }
}
