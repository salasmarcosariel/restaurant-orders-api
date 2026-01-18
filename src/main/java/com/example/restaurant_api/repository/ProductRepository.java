package com.example.restaurant_api.repository;


import com.example.restaurant_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}