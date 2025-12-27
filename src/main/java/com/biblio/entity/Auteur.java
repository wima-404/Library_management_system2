package com.biblio.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Auteur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuteur;

    private String nom;

    @ManyToMany(mappedBy = "auteurs")
    private Set<Livre> livres = new HashSet<>();
}
