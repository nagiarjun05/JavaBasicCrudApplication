package com.example.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="product",schema = "sample")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name = "product_type",discriminatorType = DiscriminatorType.STRING)
public abstract class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String p_name;
    private BigDecimal prize;

    @Column(name = "product_type",insertable = false,updatable = false)
    private String productType;


};