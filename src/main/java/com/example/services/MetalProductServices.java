package com.example.services;

import com.example.models.MetalProduct;
import com.example.repositories.MetalProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MetalProductServices {
    private final MetalProductRepository metalProductRepository;
    @Autowired
    public MetalProductServices(MetalProductRepository metalProductRepository) {
        this.metalProductRepository = metalProductRepository;
    }
    public List<MetalProduct> getAllMetalProduct(){
        return metalProductRepository.findAll();
    };
}
