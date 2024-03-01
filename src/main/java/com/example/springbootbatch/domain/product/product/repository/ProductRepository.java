package com.example.springbootbatch.domain.product.product.repository;

import com.example.springbootbatch.domain.product.product.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByCreateDateBetween(LocalDateTime startDate, LocalDateTime endDate, Pageable pageable);
}
