package com.iset.service_offreEmploi.dao;

import com.iset.service_offreEmploi.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffreRepository extends JpaRepository<Offre, Long> {
}
