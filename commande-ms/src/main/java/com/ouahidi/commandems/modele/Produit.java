package com.ouahidi.commandems.modele;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
@Builder
public class Produit {
    private Long  id;
    private String intitule;
    private Double prix;
    private Integer stock;
}
