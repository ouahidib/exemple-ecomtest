package com.ouahidi.produitms;

import com.ouahidi.produitms.entities.Produit;
import com.ouahidi.produitms.repositories.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProduitMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProduitMsApplication.class, args);
	}

	@Bean
    CommandLineRunner init(ProduitRepository repository) {
		return args -> {
			Produit p1 = Produit.builder()
					.intitule("PC DELL")
					.prix(7000.00)
					.stock(10)
					.build();
			repository.save(p1);

			Produit p2 = Produit.builder()
					.intitule("PC HP")
					.prix(9000.00)
					.stock(5)
					.build();
			repository.save(p2);



		};
	}
}
