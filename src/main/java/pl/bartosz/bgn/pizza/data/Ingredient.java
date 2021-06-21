package pl.bartosz.bgn.pizza.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity(name = "ingredients")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "id"})
public class Ingredient {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE )
    private long id;

    @Column(unique = true)
    private String name;

}
