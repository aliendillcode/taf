package br.mil.eb.hmilacg.taf.Repositories;

import br.mil.eb.hmilacg.taf.Entities.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
