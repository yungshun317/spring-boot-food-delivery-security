package yungshun.chang.springbootfooddeliverysecurity.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import yungshun.chang.springbootfooddeliverysecurity.Order;
import yungshun.chang.springbootfooddeliverysecurity.Taco;
import yungshun.chang.springbootfooddeliverysecurity.data.IngredientRepository;
import yungshun.chang.springbootfooddeliverysecurity.data.TacoRepository;

public class DesignTacoController {

    private final IngredientRepository ingredientRepo;
    private TacoRepository tacoRepo;

    @Autowired
    public DesignTacoController(IngredientRepository ingredientRepo, TacoRepository tacoRepo) {
        this.ingredientRepo = ingredientRepo;
        this.tacoRepo = tacoRepo;
    }

    @ModelAttribute(name="order")
    public Order order() {
        return new Order();
    }

    @ModelAttribute(name="design")
    public Taco design() {
        return new Taco();
    }
}
