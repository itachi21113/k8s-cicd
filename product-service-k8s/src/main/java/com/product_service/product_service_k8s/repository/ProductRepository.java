package com.product_service.product_service_k8s.repository;

import com.product_service.product_service_k8s.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}