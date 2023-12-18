package com.example.productmanagementsystem.Entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class OrderService {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Order> getShippedOrders() {
        TypedQuery<Order> query = entityManager.createQuery("SELECT o FROM Order o WHERE o.status = 'Shipped'", Order.class);
        return query.getResultList();
    }

    // Additional methods for managing orders
}
