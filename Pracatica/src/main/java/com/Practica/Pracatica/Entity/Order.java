package com.Practica.Pracatica.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.sql.Date;
import java.time.format.DateTimeFormatter;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderid;

    @ManyToOne
    @JoinColumn( name = "customerID")
    private Customer customerId; //foreign key from Customer

    @ManyToOne
    @JoinColumn( name = "customerName")
    private Customer customerName; //foreign key from customer

    @ManyToOne
    @JoinColumn( name = "productId")
    private Product productId; //foreign key from Product

    private float amount;
    private Date orderDate;

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Customer getCustomerName() {
        return customerName;
    }

    public void setCustomerName(Customer customerName) {
        this.customerName = customerName;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
