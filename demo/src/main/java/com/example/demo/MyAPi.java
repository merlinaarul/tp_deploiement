package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
//JPA
//H2 en memoire...

@RestController
public class MyAPi {
    @GetMapping(value ="/b")
    public String bonjour(){
        return "Bonjour !";
    }

    @GetMapping(value ="/bn")
    public String bonsoir(){
        return "Bonsoir !";
    }

    @GetMapping(value ="/etudiant")
    public Etudiant getEtudiant(){
        return new Etudiant(1, "a", 19);
    }

    @GetMapping(value ="/somme")
    public double somme(double a, double b){
        return a+b;
    }
    public static ArrayList<Etudiant> liste =  new ArrayList<>();
    static {
        liste.add(new Etudiant(0, "A",19));
        liste.add(new Etudiant(1, "B",14));
        liste.add(new Etudiant(2, "C",15));
        liste.add(new Etudiant(3, "D",17));
    }

    @GetMapping(value ="/liste")
    public ArrayList<Etudiant> getAllEtudiants(){
        return liste;
    }

    @GetMapping(value ="/getEtudiant")
    public Etudiant getEtudiant(int id){
        return liste.get(id);
    }

    @PostMapping(value = "/addEtudiant")
    public Etudiant addEtudiant(Etudiant etudiant){
        liste.add(etudiant);
        return etudiant;
    }

    @DeleteMapping(value = "/delete")
    public void supprimerEtudiant(int id){
        liste.remove(id);
    }

    @PutMapping(value = "/modifier")
    public void modifierEtudiant(int id, String nom){
        liste.get(id).setNom(nom);
    }
    //Get renvoie d'une ressource
    //Post : pour creer un nouvel element de la liste
    //Put : pour modifier un elem de la liste
    //delete : pour supprimer un elem de la liste
}
