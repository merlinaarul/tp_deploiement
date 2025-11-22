package com.example.H2demo.entite;

//Hibernate une des implementation de JPA

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Adherant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String ville;
    private int age;

    public Adherant() {

    }
    public Adherant(Long id, String nom, String ville, int age) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
    }
}
