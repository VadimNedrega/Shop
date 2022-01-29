package com.example.PeEx.shop.controller;

import com.example.PeEx.shop.controller.common.AbstractController;
import com.example.PeEx.shop.domain.Client;
import com.example.PeEx.shop.service.ClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController extends AbstractController<Client, ClientService> {
    public ClientController (ClientService clientService){
        super(clientService);
    }
}
