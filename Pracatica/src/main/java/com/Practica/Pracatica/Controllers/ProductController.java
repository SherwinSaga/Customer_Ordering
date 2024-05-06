package com.Practica.Pracatica.Controllers;

import com.Practica.Pracatica.Entity.Product;
import com.Practica.Pracatica.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product>getAllProducts(){
        return productRepository.findAll();
    }
}
