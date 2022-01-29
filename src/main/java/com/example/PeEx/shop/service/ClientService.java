package com.example.PeEx.shop.service;

import com.example.PeEx.shop.domain.Client;
import com.example.PeEx.shop.repository.ClientRepository;
import com.example.PeEx.shop.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ClientService extends AbstractService<Client, ClientRepository> {

    public ClientService(ClientRepository repository) {
        super(repository);
    }
}
