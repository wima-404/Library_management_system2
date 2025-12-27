package com.biblio.repository;

import com.biblio.entity.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {
    List<Emprunt> findByDateEmprunt(LocalDate date);
    List<Emprunt> findByDateRetourEffectiveIsNull();
    List<Emprunt> findByDateRetourEffectiveIsNullAndDateRetourPrevueBefore(LocalDate date);
    List<Emprunt> findByUtilisateurIdUtilisateur(Long idUtilisateur);
}
