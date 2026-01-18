package com.example.restaurant_api.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal price;
    private String category;
    private Integer stock;

    // getters y setters

    public BigDecimal getPrice() {
        return price;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}