package com.ouahidi.commandems.entities;

import com.ouahidi.commandems.modele.Client;
import com.ouahidi.commandems.modele.Produit;
import jakarta.persistence.*;
import lombok.*;

@Entity

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@Builder
public class Commande {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idProduit;
    private Long idClient;
    @Transient
    private Client client;
    @Transient
    private Produit produit;
    private Integer quatiteAchete;

}
