package com.example.H2demo.repository;

import com.example.H2demo.entite.Adherant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdherantRepo extends JpaRepository<Adherant, Long> {
}
