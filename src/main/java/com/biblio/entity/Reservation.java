package com.biblio.entity;

import com.biblio.enums.StatutReservation;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Reservation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateReservation;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private Exemplaire exemplaire;
}
