package com.ouahidi.commandems.repositories;

import com.ouahidi.commandems.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
