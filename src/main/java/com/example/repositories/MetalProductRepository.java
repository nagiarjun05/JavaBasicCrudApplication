package com.example.repositories;

import com.example.models.MetalProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetalProductRepository extends JpaRepository<MetalProduct, Long> {
};
