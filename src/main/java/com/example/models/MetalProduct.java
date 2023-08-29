package com.example.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@DiscriminatorValue(value="metal_product")
@PrimaryKeyJoinColumn(name="product_id")
@Table(name="metal_product", schema = "sample")
public class MetalProduct extends Product {
    private String metal_name;
};
