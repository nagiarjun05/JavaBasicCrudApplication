package com.example.services;

import com.example.models.WoodenProduct;
import com.example.repositories.WoodenProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WoodenProductServices {
    private final WoodenProductRepository woodenProductRepository;
    @Autowired
    public WoodenProductServices(WoodenProductRepository woodenProductRepository) {
        this.woodenProductRepository = woodenProductRepository;
    }
    public List<WoodenProduct> getAllWoodenProduct(){
        return woodenProductRepository.findAll();
    };
}
