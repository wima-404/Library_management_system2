package com.biblio.dto.request;

import java.time.LocalDate;

public record EmpruntRequestDTO(Long idUtilisateur, String codeExemplaire, LocalDate dateRetourPrevue) {}
