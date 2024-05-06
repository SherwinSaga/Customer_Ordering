package com.Practica.Pracatica.Repositories;

import com.Practica.Pracatica.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
