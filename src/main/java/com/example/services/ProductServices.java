package com.example.services;

import com.example.dtos.ProductDto;
import com.example.models.Product;
import com.example.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {
    private final ProductRepository productRepository;
    @Autowired
    public ProductServices(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    public List<ProductDto> getAllProducts(){
        return ProductDto.getAllProductDtos(productRepository.findAll());
    }
    public void postProduct(Product product){
        productRepository.save(product);
    }
}
