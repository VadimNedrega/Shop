package com.example.PeEx.shop.repository;

import com.example.PeEx.shop.domain.Category;
import com.example.PeEx.shop.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
