package com.ust.CompositeKey.repository;


import com.ust.CompositeKey.model.OrderItem;
import com.ust.CompositeKey.model.OrderItemId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemId> {}

