package com.example.restaurant_api.repository;

import com.example.restaurant_api.model.OrderEntity;
import com.example.restaurant_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

    List<OrderEntity> findByUser(User user);
}