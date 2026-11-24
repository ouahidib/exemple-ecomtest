package com.ouahidi.produitms.web;

import com.ouahidi.produitms.entities.Produit;
import com.ouahidi.produitms.repositories.ProduitRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/produits")

public class ProduitRestController {
    public ProduitRestController(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    ProduitRepository      produitRepository;

    @GetMapping
    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    @GetMapping("/{id}")
    public Produit findById(@PathVariable Long id) {
        return produitRepository.findById(id).get();
    }


}
