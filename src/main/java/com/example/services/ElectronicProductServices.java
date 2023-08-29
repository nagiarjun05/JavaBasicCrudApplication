package com.example.services;

import com.example.models.ElectronicProduct;
import com.example.repositories.ElectronicProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ElectronicProductServices {
    private final ElectronicProductRepository electronicProductRepository;
    @Autowired
    public ElectronicProductServices(ElectronicProductRepository electronicProductRepository) {
        this.electronicProductRepository = electronicProductRepository;
    }
    public List<ElectronicProduct> getAllElectronicProduct(){
        return electronicProductRepository.findAll();
    };
}
