package com.Practica.Pracatica.Entity;

import jakarta.persistence.*;
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn( name = "productId")
    private Product productId;  //Foreign key from Product
    private int quantity;
    private int shopNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getShopNo() {
        return shopNo;
    }

    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }
}
