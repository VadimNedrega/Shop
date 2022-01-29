package com.example.PeEx.shop.controller;

import com.example.PeEx.shop.controller.common.AbstractController;
import com.example.PeEx.shop.domain.Client;
import com.example.PeEx.shop.domain.Product;
import com.example.PeEx.shop.service.ClientService;
import com.example.PeEx.shop.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController extends AbstractController<Product, ProductService> {
    public ProductController(ProductService productService){
        super(productService);
    }
}
