package com.example.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@DiscriminatorValue(value="wooden_product")
@Table(name="wooden_product", schema = "sample")
@PrimaryKeyJoinColumn(name="product_id")
public class WoodenProduct extends Product {
    private Long weight;
};
