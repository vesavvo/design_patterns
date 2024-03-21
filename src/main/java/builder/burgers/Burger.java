package builder.burgers;


import java.util.ArrayList;
import java.util.List;


public class Burger {

    private List<Ingredient> ingredients;

    public Burger() {
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Ingredient ingredient : ingredients) {
            sb.append(ingredient.getName());
            sb.append("\n");
        }
        return sb.toString();
    }
}
