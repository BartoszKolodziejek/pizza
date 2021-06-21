package pl.bartosz.bgn.pizza.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bartosz.bgn.pizza.data.Pizza;

public interface PizzaPersistRepository extends JpaRepository<Pizza, Long> {
}
