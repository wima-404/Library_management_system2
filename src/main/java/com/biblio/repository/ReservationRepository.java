package com.biblio.repository;

import com.biblio.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByUtilisateurIdUtilisateur(Long idUtilisateur);
}
