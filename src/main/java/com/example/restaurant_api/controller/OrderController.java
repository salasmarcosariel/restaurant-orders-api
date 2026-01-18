package com.example.restaurant_api.controller;

import com.example.restaurant_api.dto.CreateOrderRequest;
import com.example.restaurant_api.dto.OrderResponse;
import com.example.restaurant_api.model.OrderEntity;
import com.example.restaurant_api.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public OrderResponse create(@RequestBody CreateOrderRequest request) {
        return service.createOrder(request);
    }
    @GetMapping("/my")
    public List<OrderResponse> myOrders() {
        return service.getMyOrders();
    }
}