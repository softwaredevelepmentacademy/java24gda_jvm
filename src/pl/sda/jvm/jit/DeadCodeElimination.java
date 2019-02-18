package pl.sda.jvm.jit;

import java.util.ArrayList;
import java.util.List;

public class DeadCodeElimination {
    public static void main(String[] args) {
        eatBreakfast();
    }

    public static void eatBreakfast() {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("cheese");
        ingredients.add("meat");
        ingredients.add("salad");
        ingredients.add("tomato");
        String sandwich = makeSandwich(ingredients);
        System.out.println(sandwich);
        // ...
    }

    private static String makeSandwich(List<String> ingredients) {
        if (null == ingredients || 0 == ingredients.size()) {
            throw new IllegalArgumentException("Ingredients must be provided!");
        }
        return ingredients.stream()
            .reduce("Sandwich: ", (a, b) -> a + ", " + b);
    }

    // #1
//    public static void eatBreakfast() {
//        List<String> ingredients = new ArrayList<>();
//        ingredients.add("cheese");
//        ingredients.add("meat");
//        ingredients.add("salad");
//        ingredients.add("tomato");
//        if (null == ingredients || 0 == ingredients.size()) {
//            throw new IllegalArgumentException("Ingredients must be provided!");
//        }
//        String sandwich = ingredients.stream()
//            .reduce("Sandwich: ", (a, b) -> a + ", " + b);
//        System.out.println(sandwich);
//        // ...
//    }

    // #2
//    public static void eatBreakfast() {
//        List<String> ingredients = new ArrayList<>();
//        ingredients.add("cheese");
//        ingredients.add("meat");
//        ingredients.add("salad");
//        ingredients.add("tomato");
//        String sandwich = ingredients.stream()
//            .reduce("Sandwich: ", (a, b) -> a + ", " + b);
//        System.out.println(sandwich);
//        // ...
//    }
}
