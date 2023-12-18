package com.example.productmanagementsystem.servlet;

import com.example.productmanagementsystem.Entity.Product;
import com.example.productmanagementsystem.repositories.ProductRepository;
import com.example.productmanagementsystem.repositories.ProductRepositoryImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductRepository productRepository = new ProductRepositoryImpl(); // Implement this class

        List<Product> products = productRepository.findAll();

        request.setAttribute("products", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("products.jsp");
        dispatcher.forward(request, response);
    }

    // Additional logic for handling user requests
}
