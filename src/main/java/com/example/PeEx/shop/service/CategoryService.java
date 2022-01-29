package com.example.PeEx.shop.service;

import com.example.PeEx.shop.domain.Category;
import com.example.PeEx.shop.repository.CategoryRepository;
import com.example.PeEx.shop.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends AbstractService<Category, CategoryRepository> {

    public CategoryService(CategoryRepository repository) {
        super(repository);
    }
}
