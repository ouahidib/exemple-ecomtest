package com.ouahidi.clientms.web;

import com.ouahidi.clientms.entities.Client;
import com.ouahidi.clientms.repositoiries.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("/clients")

public class ClientRestController {
    public ClientRestController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    private final ClientRepository clientRepository;

    @GetMapping
    public List<Client> findAll() {
        return clientRepository.findAll();
    }
    @GetMapping("/{id}")
    public Client findById(@PathVariable Long id) {
        return clientRepository.findById(id).get();
    }

}
