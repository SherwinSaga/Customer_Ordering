package com.Practica.Pracatica.Repositories;

import com.Practica.Pracatica.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{
}
