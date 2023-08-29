package com.example.repositories;

import com.example.models.WoodenProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WoodenProductRepository extends JpaRepository<WoodenProduct, Long> {
};
