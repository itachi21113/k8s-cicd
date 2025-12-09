package com.order_service.order_service_k8s.controller;

import com.order_service.order_service_k8s.dto.OrderRequest;
import com.order_service.order_service_k8s.model.Order;
import com.order_service.order_service_k8s.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository orderRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setSkuCode(orderRequest.getSkuCode());
        order.setPrice(orderRequest.getPrice());
        order.setQuantity(orderRequest.getQuantity());

        orderRepository.save(order);
        return "Order Placed Successfully";
    }
}