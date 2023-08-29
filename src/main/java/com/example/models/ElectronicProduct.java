package com.example.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@DiscriminatorValue(value="electronic_product")
@PrimaryKeyJoinColumn(name="product_id")
@Table(name="electronic_product", schema = "sample")
public class ElectronicProduct extends Product {
    private Long power;
};
