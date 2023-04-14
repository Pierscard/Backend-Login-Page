package com.example.PROVAESAME.Repository;

import com.example.PROVAESAME.Entity.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer> {

}
