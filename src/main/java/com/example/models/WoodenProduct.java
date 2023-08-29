package com.example.models;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="wooden_product")
@Table(name="wooden_product", schema = "sample")
@PrimaryKeyJoinColumn(name="product_id")
public class WoodenProduct extends Product {
    private Long weight;
    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }
};
