package com.ouahidi.commandems;

import com.ouahidi.commandems.entities.Commande;
import com.ouahidi.commandems.repositories.CommandeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class CommandeMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandeMsApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(CommandeRepository repository) {
        return args -> {
            Commande cm1= Commande.builder()
                    .idClient(1L)
                    .idProduit(1L)
                    .quatiteAchete(4)
                    .build();
            repository.save(cm1);
            Commande cm2= Commande.builder()
                    .idClient(2L)
                    .idProduit(2L)
                    .quatiteAchete(5)
                    .build();
            repository.save(cm2);


        };
    }
}
