package com.joaopaulo.crud_java_ecommerce.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaopaulo.crud_java_ecommerce.models.ProductEntity;
import com.joaopaulo.crud_java_ecommerce.services.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ProductEntity create(@RequestBody ProductEntity productEntity) {
        return productService.create(productEntity);
    }

    @GetMapping 
    public List<ProductEntity> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public ProductEntity getById(@PathVariable Long id) {
        return productService.getById(id);
    }

    @DeleteMapping("/{id}")
    public ProductEntity deleteById(@PathVariable Long id) {
        return productService.deleteById(id);
    }

    @PutMapping("/{id}")
    public ProductEntity updateById(@PathVariable Long id, @RequestBody ProductEntity productEntity) {
        return productService.updateById(id, productEntity);
    }
}
