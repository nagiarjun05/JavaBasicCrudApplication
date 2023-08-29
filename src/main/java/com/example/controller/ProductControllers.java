package com.example.controller;
import com.example.dtos.ProductDto;
import com.example.models.ElectronicProduct;
import com.example.models.MetalProduct;
import com.example.models.Product;
import com.example.models.WoodenProduct;
import com.example.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Properties;
import java.util.stream.Stream;

@SpringBootApplication

@RestController
public class ProductControllers {
    @Autowired
    private ProductServices productServices;
    private ElectronicProductServices electronicProductServices;
    private WoodenProductServices woodenProductServices;
    private MetalProductServices metalProductServices;

    @GetMapping("product")
    public ResponseEntity <List<ProductDto>> getProducts(){;
        return new ResponseEntity<> (productServices.getAllProducts(), HttpStatus.OK);
    }
    @GetMapping("metal")
    public ResponseEntity <List<MetalProduct>> getMetalProducts(){
        return new ResponseEntity<> (metalProductServices.getAllMetalProduct(), HttpStatus.OK);
    }
    @GetMapping("electronic")
    public ResponseEntity <List<ElectronicProduct>> getElectronicProducts(){
        return new ResponseEntity<> (electronicProductServices.getAllElectronicProduct(), HttpStatus.OK);
    }
    @GetMapping("wooden")
    public ResponseEntity <List<WoodenProduct>> getWoodenProducts(){
        return new ResponseEntity<> (woodenProductServices.getAllWoodenProduct(), HttpStatus.OK);
    }
    @PostMapping("metal")
    public void addMetalProduct(@RequestBody MetalProduct metalProduct){
        productServices.postProduct(metalProduct);
    }
//    @PostMapping("product")
//    public void addProduct(@RequestBody Product product){
//        productServices.postProduct(product);
//    }
    @PostMapping("wooden")
    public void addWoodenProduct(@RequestBody WoodenProduct woodenProduct){
        productServices.postProduct(woodenProduct);
    }
    @PostMapping("electronic")
    public void addElectronicProduct(@RequestBody ElectronicProduct electronicProduct){
        productServices.postProduct(electronicProduct);
    }
}
