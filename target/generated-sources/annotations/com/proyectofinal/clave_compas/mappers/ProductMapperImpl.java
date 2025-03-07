package com.proyectofinal.clave_compas.mappers;

import com.proyectofinal.clave_compas.bd.clavecompas.entities.CategoryEntity;
import com.proyectofinal.clave_compas.bd.clavecompas.entities.ProductEntity;
import com.proyectofinal.clave_compas.service.dto.ProductDTO;
import java.math.BigDecimal;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-07T03:59:11-0500",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.6 (Amazon.com Inc.)"
)
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO toDTO(ProductEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Integer idCategory = null;
        List<String> imageUrls = null;
        Integer idProduct = null;
        String name = null;
        String brand = null;
        String model = null;
        Integer year = null;
        Integer stock = null;
        String description = null;
        BigDecimal price = null;
        Boolean available = null;

        idCategory = entityCategoryIdCategory( entity );
        imageUrls = mapImagesToUrls( entity.getImages() );
        idProduct = entity.getIdProduct();
        name = entity.getName();
        brand = entity.getBrand();
        model = entity.getModel();
        year = entity.getYear();
        stock = entity.getStock();
        description = entity.getDescription();
        price = entity.getPrice();
        available = entity.getAvailable();

        ProductDTO productDTO = new ProductDTO( idProduct, name, brand, model, year, stock, description, price, available, idCategory, imageUrls );

        return productDTO;
    }

    @Override
    public ProductEntity toEntity(ProductDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ProductEntity.ProductEntityBuilder productEntity = ProductEntity.builder();

        productEntity.category( productDTOToCategoryEntity( dto ) );
        productEntity.idProduct( dto.idProduct() );
        productEntity.name( dto.name() );
        productEntity.brand( dto.brand() );
        productEntity.model( dto.model() );
        productEntity.year( dto.year() );
        productEntity.stock( dto.stock() );
        productEntity.description( dto.description() );
        productEntity.price( dto.price() );
        productEntity.available( dto.available() );

        return productEntity.build();
    }

    private Integer entityCategoryIdCategory(ProductEntity productEntity) {
        CategoryEntity category = productEntity.getCategory();
        if ( category == null ) {
            return null;
        }
        return category.getIdCategory();
    }

    protected CategoryEntity productDTOToCategoryEntity(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        CategoryEntity.CategoryEntityBuilder categoryEntity = CategoryEntity.builder();

        categoryEntity.idCategory( productDTO.idCategory() );

        return categoryEntity.build();
    }
}
