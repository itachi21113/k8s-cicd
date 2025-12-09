package com.order_service.order_service_k8s.repository;

import com.order_service.order_service_k8s.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}