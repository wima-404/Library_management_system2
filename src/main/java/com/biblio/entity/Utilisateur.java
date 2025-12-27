package com.biblio.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Utilisateur {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtilisateur;

    private String nomComplet;
    private String adresse;

    @Column(unique = true, nullable = false)
    private String cin;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String username;

    private String password;

    @OneToMany(mappedBy = "utilisateur")
    private Set<Emprunt> emprunts = new HashSet<>();

    @OneToMany(mappedBy = "utilisateur")
    private Set<Reservation> reservations = new HashSet<>();
}
