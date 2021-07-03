package yungshun.chang.springbootfooddeliverysecurity.data;

import org.springframework.data.repository.CrudRepository;
import yungshun.chang.springbootfooddeliverysecurity.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
