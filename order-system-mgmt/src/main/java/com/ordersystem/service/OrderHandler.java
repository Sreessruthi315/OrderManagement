package com.ordersystem.service;

import com.ordersystem.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderHandler {

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    public void sendOrder(Order order) {
    	System.out.println("Producer order: " + order.getId() + " " + order.getProduct());
        kafkaTemplate.send("order_topic", order);
    }
}