package com.example.repositories;

import com.example.models.ElectronicProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectronicProductRepository extends JpaRepository<ElectronicProduct, Long>{
};
