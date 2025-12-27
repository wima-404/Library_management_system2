package com.biblio.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Exemplaire {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExemplaire;

    @Column(unique = true, nullable = false)
    private String codeExemplaire;

    private boolean disponible = true;

    @ManyToOne
    @JoinColumn(name="isbn")
    private Livre livre;
}
