package com.ordersystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ordersystem.model.Order;
import com.ordersystem.repository.OrderRepository;
import com.ordersystem.service.OrderHandler;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderHandler orderHandler;
    
    @Autowired
    private OrderRepository orderRepository;
    

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> getOrderById(@PathVariable String id) {
        return orderRepository.findById(id);
    }
        
    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody Order order) {
        orderHandler.sendOrder(order);
        return ResponseEntity.ok("Order placed successfully!");
    }
}