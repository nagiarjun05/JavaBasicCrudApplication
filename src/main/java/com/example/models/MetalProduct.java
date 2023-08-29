package com.example.models;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="metal_product")
@PrimaryKeyJoinColumn(name="product_id")
@Table(name="metal_product", schema = "sample")
public class MetalProduct extends Product {
    private String metal_name;
    public String getMetal_name() {
        return metal_name;
    }
    public void setMetal_name(String metal_name) {
        this.metal_name = metal_name;
    }
};
