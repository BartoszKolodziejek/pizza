package pl.bartosz.bgn.pizza;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.bartosz.bgn.pizza.data.Pizza;

import java.util.List;
import java.util.Set;

@RestController()
@RequiredArgsConstructor
public class PizzaController {

    private final PizzaService pizzaService;

    @PutMapping(path = "pizza")
    public Pizza addPizza(@RequestBody final Pizza pizza){
        return pizzaService.persistPizza(pizza);
    }

    @GetMapping(value = "pizza/{id}")
    public Pizza getPizzaById(@PathVariable long id) {
        return pizzaService.getById(id);
    }

    @GetMapping(value = "pizzas")
    public List<Pizza> getPizzas(){
        return pizzaService.getAll();
    }
}
