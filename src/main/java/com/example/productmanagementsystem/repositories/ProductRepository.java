package com.example.productmanagementsystem.repositories;



import com.example.productmanagementsystem.Entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    // Add other methods as needed
}
