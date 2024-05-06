package com.Practica.Pracatica.Controllers;

import com.Practica.Pracatica.Entity.Customer;
import com.Practica.Pracatica.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public ResponseEntity<Customer> editCustomer(@PathVariable int customerId, @RequestBody Customer customerDetails) throws Exception {

        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new Exception("Customer not found : " +customerId));

        customer.setCustomerName(customerDetails.getCustomerName());
        customer.setAddress(customerDetails.getAddress());
        customer.setPhoneNumber(customerDetails.getPhoneNumber());

        Customer updatedCustomer = customerRepository.save(customer);
        return ResponseEntity.ok(updatedCustomer);
    }
}
