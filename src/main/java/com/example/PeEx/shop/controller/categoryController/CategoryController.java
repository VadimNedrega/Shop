package com.example.PeEx.shop.controller.categoryController;

import com.example.PeEx.shop.controller.exception.CategoryNotFoundException;
import com.example.PeEx.shop.domain.Category;
import com.example.PeEx.shop.repository.CategoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    private final CategoryRepository repository;

    public CategoryController(CategoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/categories")
    List<Category> all() {
        return repository.findAll();
    }

    @PostMapping("/categories")
    Category newCategory(@RequestBody Category newCategory){
        return repository.save(newCategory);
    }

    @GetMapping("/categories/{id}")
    Category one(@PathVariable Long id){
        return repository.findById(id).orElseThrow(()-> new CategoryNotFoundException(id));
    }

    @PutMapping("/categories/{id}")
    Category replaceClient(@RequestBody Category newCategory, @PathVariable Long id) {

        return repository.findById(id)
                .map(category -> {
                    category.setName(newCategory.getName());
                    return repository.save(category);
                })
                .orElseGet(() -> {
                    newCategory.setId(id);
                    return repository.save(newCategory);
                });
    }

    @DeleteMapping("/categories/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
