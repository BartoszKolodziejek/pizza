package pl.bartosz.bgn.pizza.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bartosz.bgn.pizza.data.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
