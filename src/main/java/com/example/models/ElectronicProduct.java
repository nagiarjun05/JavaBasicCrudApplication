package com.example.models;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="electronic_product")
@PrimaryKeyJoinColumn(name="product_id")
@Table(name="electronic_product", schema = "sample")
public class ElectronicProduct extends Product {




//    private Long product_id;
    private Long power;

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }
};
