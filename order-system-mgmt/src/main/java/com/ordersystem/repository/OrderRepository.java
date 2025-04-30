package com.ordersystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ordersystem.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {}