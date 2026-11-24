package com.ouahidi.commandems.web;

import com.ouahidi.commandems.modele.Client;
import com.ouahidi.commandems.modele.Produit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="PRODUIT-MS")
public interface ProduitFeign {
    @GetMapping("/produits/{id}")
    public Produit getProduitById(@PathVariable Long id);

}
