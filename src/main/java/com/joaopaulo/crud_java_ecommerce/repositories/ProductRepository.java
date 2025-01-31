package com.joaopaulo.crud_java_ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaopaulo.crud_java_ecommerce.models.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    
}
