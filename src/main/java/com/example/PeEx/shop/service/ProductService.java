package com.example.PeEx.shop.service;

import com.example.PeEx.shop.domain.Client;
import com.example.PeEx.shop.domain.Product;
import com.example.PeEx.shop.repository.ClientRepository;
import com.example.PeEx.shop.repository.ProductRepository;
import com.example.PeEx.shop.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends AbstractService<Product, ProductRepository> {

    public ProductService(ProductRepository repository) {
        super(repository);
    }
}
