package br.mil.eb.hmilacg.taf.Repositories;

import br.mil.eb.hmilacg.taf.Entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
}
