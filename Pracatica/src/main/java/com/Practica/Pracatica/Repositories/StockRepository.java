package com.Practica.Pracatica.Repositories;

import com.Practica.Pracatica.Entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer> {
}
