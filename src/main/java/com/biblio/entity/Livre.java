package com.biblio.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Livre {

    @Id
    private String isbn;

    private String titre;
    private LocalDate dateEdition;

    private Double prix;
    private Integer stockDisponible;

    @ManyToMany
    @JoinTable(
            name="livre_auteur",
            joinColumns=@JoinColumn(name="isbn"),
            inverseJoinColumns=@JoinColumn(name="id_auteur")
    )
    private Set<Auteur> auteurs = new HashSet<>();

    @OneToMany(mappedBy = "livre")
    private Set<Exemplaire> exemplaires = new HashSet<>();
}
