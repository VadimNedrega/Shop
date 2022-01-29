package com.example.PeEx.shop.controller;

import com.example.PeEx.shop.controller.common.AbstractController;
import com.example.PeEx.shop.domain.ClientOrder;
import com.example.PeEx.shop.service.ClientOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class ClientOrderController extends AbstractController<ClientOrder, ClientOrderService> {
    public ClientOrderController(ClientOrderService clientOrderService){
        super(clientOrderService);
    }
}
