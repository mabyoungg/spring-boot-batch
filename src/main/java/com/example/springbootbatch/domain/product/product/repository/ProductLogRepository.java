package com.example.springbootbatch.domain.product.product.repository;

import com.example.springbootbatch.domain.product.product.entity.Product;
import com.example.springbootbatch.domain.product.product.entity.ProductLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductLogRepository extends JpaRepository<ProductLog, Long> {
}
