package com.biblio.repository;

import com.biblio.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LivreRepository extends JpaRepository<Livre, String> {
    List<Livre> findByTitreContainingIgnoreCase(String titre);
}
