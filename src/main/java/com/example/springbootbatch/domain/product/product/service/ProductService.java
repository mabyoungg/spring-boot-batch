package com.example.springbootbatch.domain.product.product.service;

import com.example.springbootbatch.domain.product.product.entity.Product;
import com.example.springbootbatch.domain.product.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    @Transactional
    public Product create(String name) {
        Product product = Product
                .builder()
                .name(name)
                .build();

        productRepository.save(product);
        return productRepository.save(product);
    }
}
