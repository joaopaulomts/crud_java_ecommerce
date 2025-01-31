package com.joaopaulo.crud_java_ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.joaopaulo.crud_java_ecommerce.models.ProductEntity;
import com.joaopaulo.crud_java_ecommerce.repositories.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ProductEntity create(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    public List<ProductEntity> getAll() {
        return productRepository.findAll();
    }

    public ProductEntity getById(Long id) {
        Optional<ProductEntity> product = productRepository.findById(id);
        if (product.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado");
        return product.get();
    }

    public ProductEntity deleteById(Long id) {
        Optional<ProductEntity> product = productRepository.findById(id);
        if (product.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado");
        productRepository.delete(product.get());
        return product.get();
    }

    public ProductEntity updateById(Long id, ProductEntity productEntity) {
        Optional<ProductEntity> product = productRepository.findById(id);
        if (product.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado");
        ProductEntity productEntity2 = productEntity;
        productEntity2.setId(id);
        productRepository.save(productEntity2);
        return product.get();
    }
}
