package com.biblio.repository;

import com.biblio.entity.Exemplaire;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface ExemplaireRepository extends JpaRepository<Exemplaire, Long> {
    Optional<Exemplaire> findByCodeExemplaire(String code);
    List<Exemplaire> findByLivreIsbn(String isbn);
}
