package com.billings.supper;

import com.billings.supper.domain.Meal;
import com.billings.supper.domain.Recipe;
import com.billings.supper.repository.MealRepository;
import com.billings.supper.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DataBootstrapper {

    @Autowired
    private MealRepository mealRepository;

    @Autowired
    private RecipeRepository recipeRepository;

    @EventListener(ContextRefreshedEvent.class)
    public void bootstrapMeals() {
        Recipe soupRecipe = new Recipe();
        soupRecipe.setDescription("Open a can and add it to a bowl");
        recipeRepository.save(soupRecipe);
        mealRepository.save(new Meal("Chicken Noodle Soup", "Some delicious soup!", soupRecipe));

        Recipe pizzaRecipe = new Recipe();
        pizzaRecipe.setDescription("Pull a pizza out of the freezer and put it in the oven");
        recipeRepository.save(pizzaRecipe);
        mealRepository.save(new Meal("Pizza", "Maybe pepperoni or sausage", pizzaRecipe));

        Recipe waffleRecipe = new Recipe();
        waffleRecipe.setDescription("Make some batter first!");
        recipeRepository.save(waffleRecipe);
        mealRepository.save(new Meal("Waffles", "you know...", waffleRecipe));
    }
}
