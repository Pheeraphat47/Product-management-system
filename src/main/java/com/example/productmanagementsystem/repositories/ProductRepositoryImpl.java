package com.example.productmanagementsystem.repositories;
import com.example.productmanagementsystem.Entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private List<Product> products;

    public ProductRepositoryImpl() {
        // Initialize products or retrieve them from a database
        this.products = new ArrayList<>();
        // Add sample product data (replace this with actual data retrieval logic)
        products.add(new Product(1, "Product A", 100.0));
        products.add(new Product(2, "Product B", 150.0));
        products.add(new Product(3, "Product C", 200.0));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    // Implement other methods as needed
}
