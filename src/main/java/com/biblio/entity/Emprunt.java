package com.biblio.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Emprunt {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmprunt;

    private LocalDate dateEmprunt;
    private LocalDate dateRetourPrevue;
    private LocalDate dateRetourEffective; // null => non retourné

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private Exemplaire exemplaire;
}
