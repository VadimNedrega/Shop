package com.example.PeEx.shop.controller;

import com.example.PeEx.shop.controller.common.AbstractController;
import com.example.PeEx.shop.domain.Category;
import com.example.PeEx.shop.service.CategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController extends AbstractController<Category, CategoryService> {
    public CategoryController(CategoryService categoryService){
        super(categoryService);
    }
}
