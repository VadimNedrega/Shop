package com.example.PeEx.shop.repository;

import com.example.PeEx.shop.domain.Client;
import com.example.PeEx.shop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
