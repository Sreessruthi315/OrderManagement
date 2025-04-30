package com.ordersystem.service;

import com.ordersystem.model.Order;
import com.ordersystem.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessor {

    @Autowired
    private OrderRepository orderRepository;

    @KafkaListener(topics = "order_topic")
    public void processOrder(Order order) {
    	System.out.println("Order id:" + order.getId() + " "+ order.getProduct() );
        orderRepository.save(order);
        
    }
}