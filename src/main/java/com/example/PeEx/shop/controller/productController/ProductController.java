package com.example.PeEx.shop.controller.productController;

import com.example.PeEx.shop.controller.exception.ProductNotFoundException;
import com.example.PeEx.shop.domain.Product;
import com.example.PeEx.shop.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/products")
    List<Product> all() {
        return repository.findAll();
    }

    @PostMapping("/products")
    Product newClient(@RequestBody Product newProduct){
        return repository.save(newProduct);
    }

    @GetMapping("/products/{id}")
    Product one(@PathVariable Long id){
        return repository.findById(id).orElseThrow(()-> new ProductNotFoundException(id));
    }

    @PutMapping("/products/{id}")
    Product replaceClient(@RequestBody Product newProduct, @PathVariable Long id) {

        return repository.findById(id)
                .map(product -> {
                    product.setName(newProduct.getName());
                    product.setColor(newProduct.getColor());
                    product.setManufacturer(newProduct.getManufacturer());
                    product.setDetails(newProduct.getDetails());
                    product.setSize(newProduct.getSize());
                    product.setPrice(newProduct.getPrice());
                    return repository.save(product);
                })
                .orElseGet(() -> {
                    newProduct.setId(id);
                    return repository.save(newProduct);
                });
    }

    @DeleteMapping("/products/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
