package com.ust.CompositeKey.controller;


import com.ust.CompositeKey.model.CustOrder;
import com.ust.CompositeKey.model.OrderItem;
import com.ust.CompositeKey.model.OrderItemId;
import com.ust.CompositeKey.repository.OrderItemRepository;
import com.ust.CompositeKey.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @PostMapping
    public CustOrder createOrder(@RequestBody CustOrder custOrder) {
        return orderRepository.save(custOrder);
    }

    @GetMapping
    public List<CustOrder> getOrders() {
        return orderRepository.findAll();
    }

    @PostMapping("/{orderId}/items")
    public OrderItem addItemToOrder(
            @PathVariable Long orderId, @RequestBody OrderItem orderItem) {
        OrderItemId orderItemId = new OrderItemId(orderId, orderItem.getId().getProductId());
        orderItem.setId(orderItemId);
        return orderItemRepository.save(orderItem);
    }

    @GetMapping("/{orderId}/items")
    public List<OrderItem> getOrderItems(@PathVariable Long orderId) {
        return orderItemRepository.findAll();
    }
}

