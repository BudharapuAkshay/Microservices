package com.ust.CompositeKey.model;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class OrderItem {
    @EmbeddedId
    private OrderItemId id;
    private Integer quantity;
    private Double price;

    public OrderItem() {}

    public OrderItem(OrderItemId id, Integer quantity, Double price) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItemId getId() { return id; }
    public void setId(OrderItemId id) { this.id = id; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}

