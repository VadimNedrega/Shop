package com.example.PeEx.shop.controller.clientController;

import com.example.PeEx.shop.controller.exception.ClientNotFoundException;
import com.example.PeEx.shop.domain.Client;
import com.example.PeEx.shop.repository.ClientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    private final ClientRepository repository;

    public ClientController(ClientRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/clients")
    List<Client> all() {
        return repository.findAll();
    }

    @PostMapping("/clients")
    Client newClient(@RequestBody Client newClient){
        return repository.save(newClient);
    }

    @GetMapping("/clients/{id}")
    Client one(@PathVariable Long id){
        return repository.findById(id).orElseThrow(()-> new ClientNotFoundException(id));
    }

    @PutMapping("/clients/{id}")
    Client replaceClient(@RequestBody Client newClient, @PathVariable Long id) {

        return repository.findById(id)
                .map(client -> {
                    client.setFirstName(newClient.getFirstName());
                    client.setLastName(newClient.getLastName());
                    client.setEmail(newClient.getEmail());
                    client.setPhone(newClient.getPhone());
                    return repository.save(client);
                })
                .orElseGet(() -> {
                    newClient.setId(id);
                    return repository.save(newClient);
                });
    }

    @DeleteMapping("/clients/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
