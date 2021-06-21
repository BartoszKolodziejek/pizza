package pl.bartosz.bgn.pizza;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.bartosz.bgn.pizza.data.Pizza;
import pl.bartosz.bgn.pizza.repositories.PizzaPersistRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PizzaService {

    private final PizzaPersistRepository pizzaRepository;


    public Pizza persistPizza(final Pizza pizza) {
        log.info("Received pizza {}", pizza);
        return pizzaRepository.save(pizza);
    }

    public Pizza getById(final long id) {
        return pizzaRepository.getById(id);
    }

    public List<Pizza> getAll(){
        return pizzaRepository.findAll();
    }
}
