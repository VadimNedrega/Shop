package com.example.PeEx.shop.controller.exception;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(Long id) {
        super("Could not find product " + id);
    }
}
