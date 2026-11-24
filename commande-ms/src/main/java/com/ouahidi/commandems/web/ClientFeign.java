package com.ouahidi.commandems.web;

import com.ouahidi.commandems.modele.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="CLIENT-MS")
public interface ClientFeign {
    @GetMapping("/clients/{id}")
    public Client getClientById(@PathVariable Long id);

}
