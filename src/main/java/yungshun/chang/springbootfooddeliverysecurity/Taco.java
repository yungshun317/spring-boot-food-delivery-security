package yungshun.chang.springbootfooddeliverysecurity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Taco {

    private Long id;

    private String name;

    private Date createdAt;

    private List<Ingredient> ingredients = new ArrayList<>();

    void createdAt() {
        this.createdAt = new Date();
    }
}
