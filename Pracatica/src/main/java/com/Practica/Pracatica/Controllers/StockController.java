package com.Practica.Pracatica.Controllers;

import com.Practica.Pracatica.Entity.Stock;
import com.Practica.Pracatica.Repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StockController {
    @Autowired
    private StockRepository stockRepository;

    @GetMapping
    public List<Stock>getAllStocks(){
        return stockRepository.findAll();
    }
}
