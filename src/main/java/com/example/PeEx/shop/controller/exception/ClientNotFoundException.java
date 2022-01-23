package com.example.PeEx.shop.controller.exception;

public class ClientNotFoundException extends RuntimeException{

    public ClientNotFoundException(Long id) {
        super("Could not find client " + id);
    }
}
