package com.Practica.Pracatica.Repositories;

import com.Practica.Pracatica.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
