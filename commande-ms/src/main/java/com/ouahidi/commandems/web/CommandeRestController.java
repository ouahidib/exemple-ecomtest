package com.ouahidi.commandems.web;

import com.ouahidi.commandems.entities.Commande;
import com.ouahidi.commandems.modele.Client;
import com.ouahidi.commandems.modele.Produit;
import com.ouahidi.commandems.repositories.CommandeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("/commandes")
public class CommandeRestController {
    public CommandeRestController(CommandeRepository commandeRepository, ClientFeign clientFeign, ProduitFeign produitFeign) {

        this.commandeRepository = commandeRepository;
        this.clientFeign = clientFeign;
        this.produitFeign = produitFeign;
    }

    CommandeRepository commandeRepository;
    ClientFeign clientFeign;
    ProduitFeign  produitFeign;

    @GetMapping
    public List<Commande> getCommandess(){
        List<Commande> liste= commandeRepository.findAll();
        List<Commande> resultat = new ArrayList<>();
        for (Commande com:liste){
            resultat.add(enrichir(com));
        }
        return resultat;



    }
    @GetMapping ("/{id}")
    public Commande getById(@PathVariable Long id){
        Commande cm= commandeRepository.findById(id).get();
        return enrichir(cm);
    }

    Commande enrichir(Commande cm){

        Client cl = clientFeign.getClientById(cm.getIdClient());
        Produit p= produitFeign.getProduitById(cm.getIdProduit());

        cm.setClient(cl);
        cm.setProduit(p);
        return  cm;
    }

}
