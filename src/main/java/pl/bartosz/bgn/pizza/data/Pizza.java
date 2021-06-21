package pl.bartosz.bgn.pizza.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity(name = "pizzas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pizza {

    @Id()
    @GeneratedValue(strategy= GenerationType.TABLE )
    private long id;

    private String name;

    private BigDecimal price;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "pizza_ingredients",
            joinColumns = @JoinColumn(name = "ingredient_id"),
            inverseJoinColumns = @JoinColumn(name = "pizza_id"))
    private List<Ingredient> ingredients;


}
