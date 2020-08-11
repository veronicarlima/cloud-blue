package br.com.cbm.repositories;

import br.com.cbm.models.Solicitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitationRepository extends JpaRepository<Solicitation, Long> {
}
