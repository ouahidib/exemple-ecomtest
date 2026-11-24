package com.ouahidi.clientms.repositoiries;

import com.ouahidi.clientms.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
