package com.Practica.Pracatica.Controllers;

import com.Practica.Pracatica.Entity.Order;
import com.Practica.Pracatica.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<?> deleteOrder(@PathVariable int orderId) {
        orderRepository.deleteById(orderId);
        return ResponseEntity.ok().build();
    }
}
