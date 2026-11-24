package com.ouahidi.clientms;

import com.ouahidi.clientms.entities.Client;
import com.ouahidi.clientms.repositoiries.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.util.ConditionalOnBootstrapEnabled;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableMBeanExport;

@SpringBootApplication
public class ClientMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientMsApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ClientRepository clientRepository    ) {
        return args -> {
            Client cl1 = Client.builder()
                    .name("Logan")
                    .email("Logan@gmail.com")
                    .build();
            clientRepository.save(cl1);

            Client cl2 = Client.builder()
                    .name("Pujolle")
                    .email("Pyjolle@gmail.com")
                    .build();
            clientRepository.save(cl2);


        };
    }
}
