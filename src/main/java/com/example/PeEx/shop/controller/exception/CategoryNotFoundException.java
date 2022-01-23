package com.example.PeEx.shop.controller.exception;

public class CategoryNotFoundException extends RuntimeException{

    public CategoryNotFoundException(Long id) {
        super("Could not find category " + id);
    }
}
