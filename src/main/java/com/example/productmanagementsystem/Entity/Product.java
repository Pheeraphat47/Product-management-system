package com.example.productmanagementsystem.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private String category;

    // Constructors, getters, and setters

    public Product(long id, String name, double price , String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }


}

