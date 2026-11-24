package com.ouahidi.produitms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString @Builder
@Entity

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    private String intitule;
    private Double prix;
    private Integer stock;
}
