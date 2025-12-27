package com.biblio.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Auteur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuteur;

    private String nom;
}
