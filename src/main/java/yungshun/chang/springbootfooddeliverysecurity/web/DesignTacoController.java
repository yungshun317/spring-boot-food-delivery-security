package yungshun.chang.springbootfooddeliverysecurity.web;

import org.springframework.beans.factory.annotation.Autowired;
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
}
