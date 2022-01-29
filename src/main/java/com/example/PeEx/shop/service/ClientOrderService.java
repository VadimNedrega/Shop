package com.example.PeEx.shop.service;

import com.example.PeEx.shop.domain.ClientOrder;
import com.example.PeEx.shop.domain.Product;
import com.example.PeEx.shop.repository.ClientOrderRepository;
import com.example.PeEx.shop.repository.ProductRepository;
import com.example.PeEx.shop.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ClientOrderService extends AbstractService<ClientOrder, ClientOrderRepository> {

    public ClientOrderService(ClientOrderRepository repository) {
        super(repository);
    }
}
